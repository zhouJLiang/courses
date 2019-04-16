package com.q.courses.entity;

import lombok.Data;

/**
 * @Author zjl
 * @Date 2019/4/16 21:56
 */
@Data
public class Teacher {
    private long tid;
    private String tname;
    /** 課程id*/
    private String courseIDs;
}
