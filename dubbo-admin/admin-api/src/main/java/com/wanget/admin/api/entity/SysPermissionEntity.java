package com.wanget.admin.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (SysPermission)表实体类
 *
 * @author Erting.Wang
 * @since 2021-07-19 17:46:09
 */
@Data
@TableName("sys_permission")
public class SysPermissionEntity implements Serializable {
    private static final long serialVersionUID = -1L;
    /**主键*/
    @TableId(value = "`id`", type = IdType.AUTO)
    private Integer id;
    /**父id*/
    @TableField("`p_id`")
    private Integer pId;
    /**1：菜单，2：url，3：按钮*/
    @TableField("`type`")
    private Integer type;

    @TableField("`status`")
    private Integer status;
    /**排序*/
    @TableField("`desc`")
    private Integer desc;
    /**名称*/
    @TableField("`name`")
    private String name;
    /**sign*/
    @TableField("`sign`")
    private String sign;
    /**描述*/
    @TableField("`icon`")
    private String icon;
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
