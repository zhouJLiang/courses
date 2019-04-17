package com.q.courses.dao;

import com.q.courses.entity.CourseRange;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author zjl
 * @Date 2019/4/16 22:28
 */
public interface CourseRangeMapper {
    @Insert("insert into t_courseRange(cid,term,week,day,lesson,teacherId,courseID) values(#{cid},#{term},#{week},#{day},#{lesson},#{teacherId},#{courseID})")
    int insert(CourseRange courseRange);

    @Delete("delete from t_courseRange where cid = #{cid}")
    int delCourseByPrimaryID(long cid);

    @Select("select * from t_courseRange where cid = #{cid}")
    CourseRange selectCourseRangeByCid(long cid);

    @Select("select * from t_courseRange")
    List<CourseRange> seleclAll();
}
