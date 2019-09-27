package com.lss.teacher_manager.controller.manager.user;

import com.lss.teacher_manager.controller.BaseController;
import com.lss.teacher_manager.pojo.user.ManagerUserDto;
import com.lss.teacher_manager.service.ManagerUserService;
import com.lss.teacher_manager.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

import java.util.Map;

@RestController
@RequestMapping("/teacher/user")
public class TeacherController extends BaseController {
    @Autowired
    TeacherService teacherService;

    @Autowired
    ManagerUserService managerUserService;

    //查询教师
    @GetMapping("/getTeacherByid")
    public Map<String,Object> getTeacherByid(){
        ManagerUserDto teacher=teacherService.getTeacherByid();
        Map<String,Object> map=new HashMap<>();
        map.put("teacher",teacher);
        return map;
    }
}
