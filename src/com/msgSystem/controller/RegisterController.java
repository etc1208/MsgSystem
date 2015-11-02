package com.msgSystem.controller;

import com.msgSystem.service.RegisterService;
import com.msgSystem.utils.RegisterException;
import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.servlet.http.HttpServletRequest;

/**
 * Created by yh on 2015/11/1.
 */
@Controller
public class RegisterController {

    @Autowired
    private RegisterService registerService;
    private JSONObject jsonObject = null;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register(){
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(String username, String password, String phone_number, String email){

        jsonObject = registerService.register(username,password,phone_number,email);
        if(jsonObject.getBoolean("success")){
            throw new RegisterException(jsonObject.get("message").toString());
        }else {
            return "register";
        }
    }

    @ExceptionHandler(value = {RegisterException.class})
    public String handlerException(Exception ex,HttpServletRequest req) {
        req.setAttribute("registerInfo",ex);
        return "login";
    }
}
