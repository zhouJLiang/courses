package com.q.courses.service;

import com.q.courses.dao.UserMapper;
import com.q.courses.entity.User;
import com.q.courses.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.UUID;

/**
 * @Author zjl
 * @Date 2019/4/10 23:48
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;
    public User getUser(long userID) {
        User user = userMapper.selectByPrimaryKey(userID);
        if(user !=null){
            return user;
        }else{
            return null;
        }
    }

    public int  insertUser(String username, String password){
        User user = new User();
        user.setId(System.currentTimeMillis());
        user.setUsername(username);
        user.setPassword(MD5Util.toMd5(password));
        user.setDatetime(new Date());
        userMapper.insert(user);
        return 1;
    }

}
