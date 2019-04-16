package com.q.courses.entity;

import lombok.Data;

/**
 * 排课信息
 * @Author zjl
 * @Date 2019/4/16 22:20
 */
@Data
public class CourseRange {
    private long cid;
    /** 学期*/
    private int term;
    /** 第几周*/
    private int week;
    /** 星期几*/
    private int day;
    /** 第几节课*/
    private int lesson;
    /** 上课老师*/
    private long teacherId;
    /** 课程id*/
    private long courseID;
}
