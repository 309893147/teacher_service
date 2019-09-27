package com.lss.teacher_manager.mapper.user;

import com.lss.teacher_manager.mapper.BaseMapper;
import com.lss.teacher_manager.pojo.user.ManagerUserDto;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;


@Component
public interface TeacherMapper extends BaseMapper<ManagerUserDto> {
    @Results({
            @Result(property = "username", column = "username"),
            @Result(property = "mobile", column = "mobile"),
            @Result(property = "deptName", column = "dept_name"),
            @Result(property = "roleName", column = "role_name"),
    })
    @Select("SELECT m.*,d.dept_name,r.role_name FROM manager_user m,t_role r,t_dept d WHERE m.user_id=#{user_id} and m.dept_id=d.dept_id and m.role=r.role_id")
    ManagerUserDto getTeacher(String userid);
}
