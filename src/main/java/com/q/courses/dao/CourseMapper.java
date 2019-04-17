package com.q.courses.dao;

import com.q.courses.entity.Course;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author zjl
 * @Date 2019/4/16 22:28
 */
@Mapper
public interface CourseMapper {
    @Insert("insert into t_course(cid,courseName,numOfWeek,teacherId,term) values(#{cid},#{courseName},#{numOfWeek},#{teacherId},#{term})")
    int insert(Course course);

    @Delete("delete from t_course where cid = #{cid}")
    int delCourseByPrimaryID(long cid);

    @Select("select * from t_course where cid = #{cid}")
    Course selectCourseByCid(long cid);

    @Select("select * from t_course")
    List<Course> selectAllCourses();

    @Select("select * from t_course where term = #{term}")
    List<Course> selectAllCourseByTerm(int term);

    @Select("select * from t_course where term = #{term} and grade = #{grade} and classNum = #{grade}")
    List<Course> selectAllTeachingClassCourse(int term,int grade,int classNum);

    @Update("update t_course set term=#{term},courseName =#{courseName},numOfWeek=#{numOfWeek},teacherid=#{teacherid}")
    int update(Course course);
}
