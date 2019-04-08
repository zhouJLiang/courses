package com.q.courses.controller;

import com.q.courses.code.CourseCode;
import com.q.courses.dao.UserDAO;
import com.q.courses.dao.UserMapper;
import com.q.courses.po.User;
import com.q.courses.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Author zjl
 * @Date: 2019/4/8 16:10
 */
@RestController
@RequestMapping("/user")
public class UserController{

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/getUser")
    public User getUser(@RequestParam("userID")int userID) {
        User user = userMapper.selectByPrimaryKey(Long.valueOf(userID));
        if (user != null) {
            return user;
        }
        return null;

    }

    @RequestMapping("/create")
    public String insertUser(@RequestParam("username") String username, @RequestParam("password") String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(MD5Util.toMd5(password));
        user.setDatetime(new Date());
        System.out.println(user.toString());
        userMapper.insert(user);
        return CourseCode.SUCCESS;
    }

}
