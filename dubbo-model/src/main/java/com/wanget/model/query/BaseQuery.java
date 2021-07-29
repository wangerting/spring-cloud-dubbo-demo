package com.wanget.model.query;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

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
    /**
     * 创建起始时间
     */
    @ApiModelProperty("创建起始时间")
    private Date startTime;
    /**
     * 创建结束时间
     */
    @ApiModelProperty("创建结束时间")
    private Date endTime;

    public BaseQuery() {
        this.page = 1;
        this.pageSize = 10;
    }

    public BaseQuery(Integer page, Integer pageSize) {
        this.page = page;
        this.pageSize = pageSize;
    }
}
