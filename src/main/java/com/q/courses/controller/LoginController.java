package com.q.courses.controller;

import com.q.courses.code.CourseCode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author zjl
 * @Date: 2019/4/17 11:18
 */
@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(@RequestParam("username") String username,@RequestParam("password") String password, ModelMap map){
        map.put("result",true);
        return "index";
    }
}
