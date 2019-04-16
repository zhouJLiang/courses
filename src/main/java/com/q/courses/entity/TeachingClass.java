package com.q.courses.entity;

import lombok.Data;

/**
 * 教学班
 * @Author zjl
 * @Date 2019/4/16 22:02
 */
@Data
public class TeachingClass {
    private long tid;
    /** 年级号*/
    private int grade;
    /** 小班号*/
    private int classNum;
    /** 班主任 id*/
    private long teacherID;
}
