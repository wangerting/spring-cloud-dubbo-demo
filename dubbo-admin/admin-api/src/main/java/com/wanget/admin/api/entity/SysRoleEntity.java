package com.wanget.admin.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (SysRole)表实体类
 *
 * @author Erting.Wang
 * @since 2021-07-19 17:46:17
 */
@Data
@TableName("sys_role")
public class SysRoleEntity implements Serializable {
    private static final long serialVersionUID = -1L;
    /**主键*/
    @TableId(value = "`id`", type = IdType.AUTO)
    private Integer id;
    /**名称*/
    @TableField("`name`")
    private String name;
    /**状态，0：禁用，1：启用*/
    @TableField("`status`")
    private Integer status;

    @TableField("`sign`")
    private String sign;
    /**描述*/
    @TableField("`content`")
    private String content;
    /**创建时间*/
    @TableField("`ctime`")
    private Date ctime;
    /**修改时间*/
    @TableField("`utime`")
    private Date utime;
    /**创建者*/
    @TableField("`creater`")
    private Integer creater;
    /**修改者*/
    @TableField("`updater`")
    private Integer updater;

}
