package com.lss.teacher_manager.pojo.user;

import com.lss.teacher_manager.pojo.BaseDto;
import lombok.Data;

@Data
public class RoleDto extends BaseDto {

    /**
     * 角色ID
     */

    private String roleId;

    /**
     * 角色名称
     */

    private String roleName;

    /**
     * 角色描述
     */

    private String remark;



    /**
     * 角色对应的菜单（按钮） id
     */
    private  String menuIds;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getMenuIds() {
        return menuIds;
    }

    public void setMenuIds(String menuIds) {
        this.menuIds = menuIds;
    }
}
