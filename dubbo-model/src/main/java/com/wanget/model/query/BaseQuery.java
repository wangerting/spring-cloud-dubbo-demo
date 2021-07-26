package com.wanget.model.query;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Erting.Wang
 * @desciption 类说明
 * @date 2021/7/23 2:04 下午
 */
@Data
public class BaseQuery implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 页数
     */
    @ApiModelProperty("页数")
    private Integer page;
    /**
     * 每页个数
     */
    @ApiModelProperty("每页个数")
    private Integer pageSize;

    public BaseQuery() {
        this.page = 1;
        this.pageSize = 10;
    }

    public BaseQuery(Integer page, Integer pageSize) {
        this.page = page;
        this.pageSize = pageSize;
    }
}
