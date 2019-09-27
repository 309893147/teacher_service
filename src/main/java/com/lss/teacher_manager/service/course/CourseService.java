package com.lss.teacher_manager.service.course;

import com.lss.teacher_manager.mapper.course.CourseMapper;
import com.lss.teacher_manager.pojo.user.CourseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements CourseMapper {
    @Autowired
    private CourseMapper courseMapper;
    @Override
    public int addcourse(CourseDto courseDto) {
       return courseMapper.addcourse(courseDto);
    }

    @Override
    public List<CourseDto> findallcourse() {
        return courseMapper.findallcourse();
    }

    @Override
    public int deletebyid(int cid) {
        return courseMapper.deletebyid(cid);
    }

    @Override
    public int updatebyid(CourseDto courseDto) {
        return courseMapper.updatebyid(courseDto);
    }
}
