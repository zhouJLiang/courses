package com.q.courses.controller;

import com.q.courses.code.CourseCode;
import com.q.courses.code.Result;
import com.q.courses.entity.User;
import com.q.courses.service.LoginService;
import com.q.courses.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private LoginService loginService;
    @RequestMapping("/login")
    @ResponseBody
    public Result login(@RequestParam("username") String username,@RequestParam("password") String password){
        Result result = new Result();
        User user = loginService.getUser(username);
        if(user != null){
            if(MD5Util.toMd5(password).equals(user.getPassword())){
                result.setSuccess(true);
                result.setMessage(username);
                ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
                attributes.getRequest().getSession().setAttribute("user", new User()); //将登陆用户信息存入到se
            }
        }else{
            result.setSuccess(false);
            result.setMessage(username);
        }
        System.out.println(username + "," + password);
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

    @RequestMapping("/register")
    @ResponseBody
    public Result register(@RequestParam("username") String username,@RequestParam("password") String password){
        Result result = new Result();
        loginService.registerUser(result,username,password);
        return result;
    }
}
