package com.wanget.admin.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * (SysRolePermission)表实体类
 *
 * @author Erting.Wang
 * @since 2021-07-19 17:46:17
 */
@Data
@TableName("sys_role_permission")
public class SysRolePermissionEntity implements Serializable {
    private static final long serialVersionUID = -1L;

    @TableId(value = "`id`", type = IdType.AUTO)
    private Integer id;

    @TableField("`role_id`")
    private Integer roleId;

    @TableField("`permission_id`")
    private Integer permissionId;

}
