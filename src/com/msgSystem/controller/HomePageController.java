package com.msgSystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yh on 2015/11/1.
 */
@Controller
public class HomePageController {

    @RequestMapping(value = "/homePage", method = RequestMethod.GET)
    public String getHomePage(){
        return "homePage";
    }
}
