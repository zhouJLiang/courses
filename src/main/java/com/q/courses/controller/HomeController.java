package com.q.courses.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author zjl
 * @Date 2019/4/9 23:28
 */
@Controller
public class HomeController {
    @RequestMapping("/index")
    public String index() {
        return "login";
    }

    @RequestMapping("/")
    public String login(){
        return "test";
    }
}
