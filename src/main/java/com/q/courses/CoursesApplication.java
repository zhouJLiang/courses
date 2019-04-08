package com.q.courses;

import com.q.courses.dao.UserMapper;
import com.q.courses.po.User;
import com.q.courses.util.MD5Util;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.InputStream;
import java.util.Date;

@SpringBootApplication
@MapperScan("com.q.courses.dao")
public class CoursesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoursesApplication.class, args);
        InputStream inputStream = null;
        SqlSessionFactory factory = null;
        SqlSession session = null;

        try {
            inputStream = Resources.getResourceAsStream("configuration.xml");
            factory = new SqlSessionFactoryBuilder().build(inputStream);
            session = factory.openSession();
            UserMapper userDAO = session.getMapper(UserMapper.class);
            User user =  userDAO.selectByPrimaryKey(1L);
            if(user!=null){
                System.out.println(user.toString());
            }else{
                user  =new User();
                user.setId(1L);
                user.setUsername("zjl");
                user.setPassword(MD5Util.toMd5("123456"));
                user.setDatetime(new Date());
                userDAO.insert(user);
                session.commit();
                System.out.println("new user create  success");
            }
            Thread.sleep(1000);
            User user2 =  userDAO.selectByPrimaryKey(1L);
            System.out.println(user2.toString());
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }

}
