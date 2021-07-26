package com.wanget.user.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * (WebUserinfo)表实体类
 *
 * @author Erting.Wang
 * @since 2021-07-19 11:12:49
 */
@Data
@TableName("web_userinfo")
public class WebUserinfoEntity implements Serializable {
    private static final long serialVersionUID = -1L;
    @TableId(value = "`id`", type = IdType.AUTO)
    private Integer id;
    @TableField("`user_id`")
    private Integer userId;
    /**
     * 性别：1：男，2：女
     */
    @TableField("`sex`")
    private Object sex;
    @TableField("`realname`")
    private String realname;
    @TableField("`birthday`")
    private String birthday;
    @TableField("`identity_number`")
    private String identityNumber;

}
