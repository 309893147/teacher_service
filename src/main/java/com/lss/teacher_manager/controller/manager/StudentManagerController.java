package com.lss.teacher_manager.controller.manager;

import com.lss.teacher_manager.controller.BaseController;
import com.lss.teacher_manager.pojo.user.ManagerUserDto;
import com.lss.teacher_manager.service.ManagerUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/manager/user/sut")
public class StudentManagerController extends BaseController {
//    @Autowired
//    private ManagerUserMapper managerUserMapper;

    @Autowired
    private ManagerUserService mManagerUserService;
    //    通过id找到任课教师
    @PostMapping("/t")
    public ManagerUserDto findtByuserid(@RequestBody ManagerUserDto managerUserDto) {
        // System.out.println(mManagerUserService.querytByid(userid).getUsername());
        return mManagerUserService.querytByid(managerUserDto.getUserId());
    }
    //    通过id找到课程信息
    @PostMapping("/c")
    public String findcByuserid(@RequestBody ManagerUserDto managerUserDto) {
        System.out.println(mManagerUserService.querycByid(managerUserDto.getUserId()));
        return successResult(mManagerUserService.querycByid(managerUserDto.getUserId()));
    }
//    @PostMapping("/q")
//    public UserDto queryByid(@RequestParam String userId){
//        return mManagerUserService.querypByid(userId);
//    }
}
