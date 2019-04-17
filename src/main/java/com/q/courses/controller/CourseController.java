package com.q.courses.controller;

import com.q.courses.entity.Course;
import com.q.courses.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author zjl
 * @Date: 2019/4/17 16:21
 */
@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/addCourse")
    public void addCourse(@RequestParam("courseName") String courseName, @RequestParam("numOfWeek")
            int numOfWeek, @RequestParam("teacherID") int teacherID, @RequestParam("grade") int term, @RequestParam("grade") int grade, @RequestParam("classNum") int classNum) {
        courseService.addCourse(courseName, numOfWeek, teacherID, term, grade, classNum);
    }
}
