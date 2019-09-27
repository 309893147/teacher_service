package com.lss.teacher_manager.mapper.course;

import com.lss.teacher_manager.pojo.user.CourseDto;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public interface CourseMapper {
    @Insert("insert into course(cname,uid,deptid) values(#{cname},#{uid},#{deptid})")
    int addcourse(CourseDto courseDto);

    @Select("select * from course ")
    List<CourseDto> findallcourse();

    @Delete("delete from course where cid=#{0}")
    int deletebyid(int cid);

    @Update("UPDATE course SET cname=#{cname},deptid=#{deptid},uid=#{uid} where cid=#{cid}")
    int updatebyid(CourseDto courseDto);

}

