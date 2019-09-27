package com.lss.teacher_manager.service;

import com.lss.teacher_manager.mapper.user.TeacherMapper;
import com.lss.teacher_manager.pojo.user.ManagerUserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherService extends BaseUserService{
    @Autowired
    private TeacherMapper teacherMapper;

    //查询教师
    public ManagerUserDto getTeacherByid(){
        String uid=super.getCurrentManagerUser().getUserId();
        return teacherMapper.getTeacher(uid);
    }
}
