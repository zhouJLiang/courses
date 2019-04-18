package com.q.courses.service;

import com.q.courses.code.CourseCode;
import com.q.courses.code.Result;
import com.q.courses.dao.UserMapper;
import com.q.courses.entity.User;
import com.q.courses.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

/**
 * @Author zjl
 * @Date: 2019/4/18 16:01
 */
@Service
public class LoginService {

    @Autowired
    private UserMapper userMapper;

    public User getUser( String username){
        return userMapper.selectUserByUserName(username);
    }

    public void registerUser(Result result,String username,String password){
        User user = getUser(username);
        if(user !=null){
            result.setSuccess(false);
            result.setMessage(CourseCode.USER_BEEN_REGISTER);
        }else{
            user = new User();
            user.setUsername(username);
            user.setPassword(MD5Util.toMd5(password));
            user.setDatetime(new Date());
            int ret = userMapper.insert(user);
            result.setSuccess(true);
            result.setMessage(username);
        }
    }
}
