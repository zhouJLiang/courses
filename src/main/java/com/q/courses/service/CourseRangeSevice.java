package com.q.courses.service;

import com.q.courses.dao.CourseRangeMapper;
import com.q.courses.entity.Course;
import com.q.courses.entity.CourseRange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.List;

/**
 * @Author zjl
 * @Date: 2019/4/17 11:59
 */
@Service
public class CourseRangeSevice {

    @Autowired
    private CourseRangeMapper courseRangeMapper;
    /**
     * 具体排哪个学期的
     * @param term
     */
    public boolean startRange(int term){
        if(checkAreadyRange(term)){
            return false;
        }
        return false;
    }

    /**
     * 已经排课
     * @param term
     * @return
     */
    private boolean checkAreadyRange(int term){
        List<CourseRange> course  = courseRangeMapper.selectAllByTerm(term);
        if(course.size() > 0){
            return true;
        }else{
            return false;
        }
    }
}
