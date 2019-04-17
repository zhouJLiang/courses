package com.q.courses.service;

import com.q.courses.dao.CourseMapper;
import com.q.courses.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Author zjl
 * @Date: 2019/4/17 15:00
 */
@Service
public class CourseService {

    @Autowired
    private CourseMapper courseMapper;

    /**
     * 获取某个 学期的所有课程
     * @param term
     * @return
     */
    public List<Course> getAllCourseByTerm(int term){
        return courseMapper.selectAllCourseByTerm(term);
    }

    /**
     * 获取某个班级  某学期的课程
     * @param term
     * @param grade
     * @param classNum
     * @return
     */
    public List<Course> getAllGradeCourse(int term,int grade,int classNum){
        return courseMapper.selectAllTeachingClassCourse(term,grade,classNum);
    }

    /**
     * 添加课程信息
     * @param course
     */
    public void addCourseInfo(Course course){
        Course tempCourse = courseMapper.selectCourseByCid(course.getCid());
        //课程已经存在 只能更新
        if(tempCourse!= null){
            return;
        }
        courseMapper.insert(course);
    }

    /**
     * 更新課程
     * @param course
     */
    public void updateCourse(Course course){
        Course tempCourse = courseMapper.selectCourseByCid(course.getCid());
        if(tempCourse == null){
            courseMapper.insert(course);
        }else{
            courseMapper.update(course);
        }
    }

    /**
     * 刪除
     */
    public void deleteCourse(Course course){
        courseMapper.delCourseByPrimaryID(course.getCid());
    }

    public void addCourse(String courseName, int numOfWeek,  int teacherID,  int term, int grade, int classNum) {
        Course course = new Course();
        course.setCourseName(courseName);
        course.setNumOfWeek(numOfWeek);
        course.setTeacherId(teacherID);
        course.setGrade(grade);
        course.setTerm(term);
        course.setClassNum(classNum);
        courseMapper.insert(course);

    }
}
