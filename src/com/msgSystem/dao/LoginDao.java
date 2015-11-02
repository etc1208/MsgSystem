package com.msgSystem.dao;

import com.msgSystem.model.User;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yh on 2015/11/1.
 */
@Repository("loginDao")
public class LoginDao {

    @Autowired
    private HibernateTemplate hibernateTemplate = null;
    private JSONObject jsonObject = null;

    public JSONObject login(String username, String password){
        jsonObject = new JSONObject();
        List<User> userList = new ArrayList<User>();
        try {
            userList = (List<User>) hibernateTemplate.find("from User where username='"+username+"'");
            if(userList.size() <= 0){
                jsonObject.put("success", false);
                jsonObject.put("message", "该用户名不存在");
            }else{
                User u = userList.get(0);
                if(u.getPassword().equals(password)){
                    jsonObject.put("success", true);
                    jsonObject.put("message", u);
                }else {
                    jsonObject.put("success", false);
                    jsonObject.put("message", "密码不正确");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            jsonObject.put("success", false);
            jsonObject.put("message", "loginDao发生异常："+e.getMessage());
        }
        return jsonObject;
    }
}
