package com.q.courses.controller;

import com.q.courses.code.CourseCode;
import com.q.courses.code.Result;
import com.q.courses.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

/**
 * @Author zjl
 * @Date: 2019/4/17 11:18
 */
@Controller
public class LoginController {
    @RequestMapping("/login")
    @ResponseBody
    public Result login(@RequestParam("username") String username,@RequestParam("password") String password){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        attributes.getRequest().getSession().setAttribute("user", new User()); //将登陆用户信息存入到se
        Result result = new Result(true,username);
        System.out.println(result);
        return  result;
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }
}
