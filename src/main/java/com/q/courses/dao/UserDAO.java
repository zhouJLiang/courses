package com.q.courses.dao;

import com.q.courses.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author zjl
 * @Date: 2019/4/8 16:14
 */
@Mapper
public interface UserDAO {
    public User selectByPrimaryKey(int id);

    public List<User> selectAll();

    public int insertUser(User user);
}
