package com.q.courses.dao;

import com.q.courses.entity.Course;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author zjl
 * @Date 2019/4/16 22:28
 */
@Mapper
public interface CourseMapper {
    @Insert("insert into t_course(cid,courseName,numOfWeek,teacherid) values(#{cid},#{courseName},#{numOfWeek},#{teacherid})")
    int insert(Course course);
    @Delete("delete from t_course where cid = #{cid}")
    int delCourseByPrimaryID(long cid);
    @Select("select * from t_course where cid = #{cid}")
    Course selectCourseByCid(long cid);
    @Select("select * from t_course")
    List<Course> seleclAll();
}
