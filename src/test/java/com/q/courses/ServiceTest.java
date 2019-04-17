package com.q.courses;

import com.q.courses.entity.Course;
import com.q.courses.service.CourseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Iterator;
import java.util.List;

/**
 * @Author zjl
 * @Date: 2019/4/17 17:44
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTest {

    @Autowired
    private CourseService courseService;

    @Test
    public void getAllCourse(){
        List<Course> allCourseByTerm = courseService.getAllCourseByTerm(1);
        if(allCourseByTerm.size() > 0){
            Iterator<Course> iterator = allCourseByTerm.iterator();
            Course course = iterator.next();
            System.out.println(course);
        }
    }
}
