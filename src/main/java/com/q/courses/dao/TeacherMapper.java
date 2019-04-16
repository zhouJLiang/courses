package com.q.courses.dao;

import com.q.courses.entity.Teacher;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author zjl
 * @Date 2019/4/16 22:29
 */
public interface TeacherMapper {
    @Insert("insert into t_teacher(tid,tname,courseIDs) values(#{tid},#{tname},#{courseIDs})")
    int insert(Teacher teacher);
    @Delete("delete from t_teacher where tid = #{tid}")
    int delTeacherByPrimaryID(long tid);
    @Select("select * from t_teacher where tid = #{tid}")
    Teacher selectTeacherByCid(long tid);
    @Select("select * from t_teacher")
    List<Teacher> seleclAll();
}
