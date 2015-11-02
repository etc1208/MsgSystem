package com.msgSystem.dao;

import com.msgSystem.model.User;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by yh on 2015/11/1.
 */
@Repository("registerDao")
public class RegisterDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;
    private JSONObject jsonObject = null;

    public JSONObject register(String username, String password, String phone, String email){
       // System.out.println(username + " " + password + " " + phone + " " + email);
        jsonObject = new JSONObject();
        try {
            User user = new User();
            user.setUsername(username);
            user.setEmail(email);
            user.setPassword(password);
            user.setPhone(phone);
            //System.out.println(user);
            hibernateTemplate.save(user);
            jsonObject.put("success", true);
            jsonObject.put("message", "注册成功,请登录");
        }catch (Exception e) {
            e.printStackTrace();
            jsonObject.put("success", false);
            jsonObject.put("message",e.getMessage());
        }
        return jsonObject;
    }
}
