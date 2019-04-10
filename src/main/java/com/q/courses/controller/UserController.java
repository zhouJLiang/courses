package com.q.courses.controller;

import com.q.courses.code.CourseCode;
import com.q.courses.dao.UserMapper;
import com.q.courses.entity.User;
import com.q.courses.service.UserService;
import com.q.courses.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * @Author zjl
 * @Date: 2019/4/8 16:10
 */
@Controller
public class UserController{

    @Autowired
    private UserService userService;
    @RequestMapping("/getUser")
    public String getUser(@RequestParam("userID")long userID) {
        User user = userService.getUser(userID);
        if(user!= null){
            System.out.println(user.toString());
        }else{
            System.out.println("no");
        }
        return "index";
    }

    @RequestMapping("/create")
    public String insertUser(@RequestParam("username") String username, @RequestParam("password") String password) {

        return CourseCode.SUCCESS;
    }

}
