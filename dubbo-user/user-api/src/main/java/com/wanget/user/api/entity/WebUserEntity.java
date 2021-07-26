package com.wanget.user.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wanget.user.api.enums.WebUserLevelEnum;
import com.wanget.user.api.enums.WebUserStatusEnum;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (WebUser)表实体类
 *
 * @author Erting.Wang
 * @since 2021-07-19 11:15:32
 */
@Data
@TableName("web_user")
public class WebUserEntity implements Serializable {
    private static final long serialVersionUID = -1L;

    @TableId(value = "`id`", type = IdType.AUTO)
    private Integer id;

    @TableField("`username`")
    private String username;

    @TableField("`password`")
    private String password;

    @TableField("`auth_key`")
    private String authKey;

    @TableField("`tel`")
    private String tel;

    @TableField("`email`")
    private String email;

    @TableField("`avatar`")
    private String avatar;
    /**状态，0：禁用，1：启用*/
    @TableField("`status`")
    private WebUserStatusEnum status;
    /**等级，1：初级...*/
    @TableField("`level`")
    private WebUserLevelEnum level;

    @TableField("`ctime`")
    private Date ctime;

    @TableField("`utime`")
    private Date utime;

}
