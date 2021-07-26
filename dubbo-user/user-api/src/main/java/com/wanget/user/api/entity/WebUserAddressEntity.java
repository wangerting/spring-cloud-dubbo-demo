package com.wanget.user.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户收货地址(WebUserAddress)表实体类
 *
 * @author Erting.Wang
 * @since 2021-07-19 11:15:09
 */
@Data
@TableName("web_user_address")
public class WebUserAddressEntity implements Serializable {
    private static final long serialVersionUID = -1L;

    @TableId(value = "`id`", type = IdType.AUTO)
    private Integer id;
    /**用户id*/
    @TableField("`user_id`")
    private Integer userId;
    /**国家*/
    @TableField("`country`")
    private Integer country;

    @TableField("`country_name`")
    private String countryName;
    /**省份*/
    @TableField("`province`")
    private Integer province;

    @TableField("`province_name`")
    private String provinceName;
    /**市*/
    @TableField("`city`")
    private Integer city;

    @TableField("`city_name`")
    private String cityName;
    /**区*/
    @TableField("`zone`")
    private Integer zone;

    @TableField("`zone_name`")
    private String zoneName;
    /**地址*/
    @TableField("`address`")
    private String address;
    /**收件人电话*/
    @TableField("`telphone`")
    private String telphone;
    /**收件人*/
    @TableField("`addressee`")
    private String addressee;
    /**状态：1：默认地址，2：普通地址*/
    @TableField("`status`")
    private Object status;
    /**创建时间*/
    @TableField("`ctime`")
    private Date ctime;
    /**更新时间*/
    @TableField("`utime`")
    private Date utime;

}
