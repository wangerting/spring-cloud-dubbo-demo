package com.wanget.admin.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (SysUser)表实体类
 *
 * @author Erting.Wang
 * @since 2021-07-19 17:46:17
 */
@Data
@TableName("sys_user")
@ApiModel("管理员信息")
public class SysUserEntity implements Serializable {
    private static final long serialVersionUID = -1L;

    @TableId(value = "`id`", type = IdType.AUTO)
    @ApiModelProperty("主键")
    private Integer id;
    /**
     * 角色
     */
    @TableField("`role_id`")
    @ApiModelProperty("角色id")
    private Integer roleId;
    /**
     * 用户名
     */
    @TableField("`username`")
    @ApiModelProperty("用户名")
    private String username;

    @TableField("`auth_key`")
    @ApiModelProperty("authKey")
    private String authKey;
    /**
     * 邮箱
     */
    @TableField("`email`")
    @ApiModelProperty("邮箱")
    private String email;
    /**
     * 电话
     */
    @TableField("`tel`")
    @ApiModelProperty("电话")
    private String tel;
    /**
     * 真实姓名
     */
    @TableField("`realname`")
    @ApiModelProperty("真实姓名")
    private String realname;
    /**
     * 密码
     */
    @TableField("`password`")
    @ApiModelProperty("密码")
    private String password;
    /**
     * 状态：0：禁用，1：启用
     */
    @TableField("`status`")
    @ApiModelProperty("状态：0：禁用，1：启用")
    private Integer status;
    /**
     * 创建时间
     */
    @TableField("`ctime`")
    @ApiModelProperty("创建时间")
    private Date ctime;
    /**
     * 修改时间
     */
    @TableField("`utime`")
    @ApiModelProperty("修改时间")
    private Date utime;
    /**
     * 创建者
     */
    @TableField("`creater`")
    @ApiModelProperty("创建者")
    private Integer creater;
    /**
     * 修改者
     */
    @TableField("`updater`")
    @ApiModelProperty("修改者")
    private Integer updater;

}
