package com.wanget.user.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wanget.user.api.enums.WebAreaPopularEnum;
import com.wanget.user.api.enums.WebAreaTypeEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * 各国城市列表(WebPublicAreas)表实体类
 *
 * @author Erting.Wang
 * @since 2021-07-19 11:16:48
 */
@Data
@TableName("WebPublicAreas")
public class WebPublicAreasEntity implements Serializable {
    private static final long serialVersionUID = -1L;

    @TableId(value = "`id`", type = IdType.AUTO)
    private Integer id;
    /**1:国家，2:省份，3：城市，4：区*/
    @TableField("`type`")
    private WebAreaTypeEnum type;
    /**父id*/
    @TableField("`areas_id`")
    private Integer areasId;

    @TableField("`name`")
    private String name;

    @TableField("`code`")
    private String code;
    /**热门城市，1：是，2：否*/
    @TableField("`popular`")
    private WebAreaPopularEnum popular;
    /**状态：1：启用，2：禁用*/
    @TableField("`status`")
    private Object status;

}
