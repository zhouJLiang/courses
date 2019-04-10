package com.q.courses.dao;

import com.q.courses.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    @Insert("insert into t_user(id,username,password,datetime) values(#{id},#{username},#{password},#{datetime})")
    int insert(User record);

    @Select("select * from t_user where id = #{id}")
    User selectByPrimaryKey(@Param("id") Long id);

    @Select("select * from t_user")
    List<User> selectAll();
    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}