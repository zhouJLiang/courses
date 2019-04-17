package com.q.courses.entity;

import lombok.Data;

/**
 * 课程信息
 * @Author zjl
 * @Date 2019/4/16 22:09
 */
@Data
public class Course {
    private long cid;
    /**  课程名字 */
    private String courseName;
    /** 每周几节课 */
    private int numOfWeek;
    /** 老师id*/
    private long teacherId;
    /**那一学期的课程 */
    private int term;
    /** 那个年级 */
    private int grade;
    /** 班级号 */
    private int classNum;
}
