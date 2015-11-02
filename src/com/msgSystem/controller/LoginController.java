package com.msgSystem.controller;

import com.msgSystem.service.LoginService;
import com.msgSystem.utils.LoginException;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by yh on 2015/11/1.
 */
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;
    private JSONObject jsonObject = null;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String username, String password, HttpSession session){
        jsonObject = new JSONObject();
        jsonObject = loginService.login(username,password);
        if(jsonObject.getBoolean("success")){
            session.setAttribute("loginUser",jsonObject.get("message"));
            return "redirect:/homePage";
        }else {
            System.out.println("登陆错误信息：" + jsonObject.get("message"));
            throw new LoginException(jsonObject.get("message").toString());
        }
    }

    @ExceptionHandler(value = {LoginException.class})
    public String handlerException(Exception ex,HttpServletRequest req) {
        req.setAttribute("exception",ex);
        return "login";
    }
}
