package com.q.courses.dao;

import com.q.courses.entity.TeachingClass;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author zjl
 * @Date 2019/4/16 22:29
 */
public interface TeachingClassMapper {
    @Insert("insert into t_teachingClass(tid,grade,classNum,teacherID) values(#{tid},#{grade},#{classNum},#{teacherID})")
    int insert(TeachingClass teachingClass);
    @Delete("delete from t_teachingClass where tid = #{tid}")
    int delTeachingClassByPrimaryID(long cid);
    @Select("select * from t_teachingClass where tid = #{tid}")
    TeachingClass selectTeachingClassByTid(long tid);
    @Select("select * from t_teachingClass")
    List<TeachingClass> seleclAll();
}
