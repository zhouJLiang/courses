package com.q.courses.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @Author zjl
 * @Date: 2019/4/8 16:04
 */
@Data
public class User {
    private long id;
    private String username;
    private String password;
    private Date datetime;
}
