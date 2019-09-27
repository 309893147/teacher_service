package com.lss.teacher_manager.controller.manager.course;

import com.lss.teacher_manager.pojo.user.CourseDto;
import com.lss.teacher_manager.service.course.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cc")
public class CourseController {
    @Autowired
    private CourseService courseService;
//    添加课程(返回1为成功0为失败)
    @PostMapping("/t")
    public void addcourse(@RequestBody CourseDto courseDto){
        courseService.addcourse(courseDto);
    }
//    查找所有课程
    @PostMapping("/f")
    public List<CourseDto> findallcourse(){
       return courseService.findallcourse();
    }
//    修改指定id课程(返回1为成功0为失败)
    @PostMapping("/u")
    public int updatecoursebyid(@RequestBody CourseDto courseDto){
        return courseService.updatebyid(courseDto);
    }
//    删除指定id课程(返回1为成功0为失败)
    @PostMapping("/d")
    public int deletecouresbyid(@RequestParam int cid){
        return courseService.deletebyid(cid);
    }
}
