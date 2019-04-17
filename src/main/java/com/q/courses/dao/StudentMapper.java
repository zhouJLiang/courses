package com.q.courses.dao;

import com.q.courses.entity.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author zjl
 * @Date 2019/4/16 22:29
 */
public interface StudentMapper {
    @Insert("insert into t_student(sid,sname,age,gradeID) values(#{sid},#{sname},#{age},#{gradeID})")
    int insert(Student student);

    @Delete("delete from t_student where sid = #{sid}")
    int delCourseByPrimaryID(long cid);

    @Select("select * from t_student where sid = #{sid}")
    Student selectCourseByCid(long sid);

    @Select("select * from t_student")
    List<Student> seleclAll();
}
