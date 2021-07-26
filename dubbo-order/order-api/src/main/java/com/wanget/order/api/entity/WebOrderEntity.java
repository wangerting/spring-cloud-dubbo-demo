package com.wanget.order.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wanget.order.api.enums.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单(WebOrder)表实体类
 *
 * @author Erting.Wang
 * @since 2021-07-19 11:38:48
 */
@Data
@TableName("web_order")
public class WebOrderEntity implements Serializable {
    private static final long serialVersionUID = -1L;

    @TableId(value = "`id`", type = IdType.AUTO)
    private Integer id;
    /**
     * 用户id
     */
    @TableField("`user_id`")
    private Integer userId;

    @TableField("`username`")
    private String username;
    /**
     * 配送地址
     */
    @TableField("`address_id`")
    private Integer addressId;
    /**
     * 收件人
     */
    @TableField("`addressee`")
    private String addressee;
    /**
     * 收件人电话
     */
    @TableField("`tel`")
    private String tel;
    /**
     * 订单状态;0:未知,1:未支付,2:已支付,3:已取消,4:已完成
     * 订单状态;UNKNOWN_0:未知,UNPAID_1:未支付,PAID_2:已支付,CANCELLED_3:已取消,COMPLETED_4:已完成
     */
    @TableField("`order_status`")
    private OrderStatusEnum orderStatus;
    /**
     * 派送状态:0:未知,1:出库中,2:已打包,3:已打包,4:派送完成
     * 派送状态:UNKNOWN_0:未知,OUT_OF_STOCK_1:出库中,PACKED_2:已打包,DELIVERING_3:已打包,COMPLETED_4:派送完成
     */
    @TableField("`delivery_status`")
    private DeliveryStatusEnum deliveryStatus;
    /**
     * 退款状态;0:未知,1:申请退款,2:审核中,3:审核完成,4:驳回,5:退款中,6:退款完成
     * 退款状态;UNKNOWN_0:未知,REFUND_1:申请退款,REVIEW_2:审核中,REVIEWED_3:审核完成,OVERRULE_4:驳回,REFUNDING_5:退款中,REFUNDED_6:退款完成
     */
    @TableField("`refund_status`")
    private RefundStatusEnum refundStatus;
    /**
     * 支付方式;0:未知,1:支付宝,2:微信
     * 支付方式;UNKNOWN_0:未知,ALIPAY_1:支付宝,WEIXIN_2:微信
     */
    @TableField("`pay_type`")
    private PayTypeEnum payType;
    /**
     * 第三方订单号
     */
    @TableField("`pay_order_id`")
    private String payOrderId;
    /**
     * 发票抬头
     */
    @TableField("`invoice`")
    private String invoice;
    /**
     * 配送方式：0:未知, 1：送货上门，2：自取
     * 配送方式：UNKNOWN_0:未知, PICKUP_1：送货上门，DELIVERY_2：自取
     */
    @TableField("`delivery_method`")
    private DeliveryMethodEnum deliveryMethod;
    /**
     * 应金额
     */
    @TableField("`amount`")
    private BigDecimal amount;
    /**
     * 实付金额
     */
    @TableField("`amount_payable`")
    private BigDecimal amountPayable;
    /**
     * 下单时间
     */
    @TableField("`ctime`")
    private Date ctime;

    @TableField("`utime`")
    private Date utime;
    /**
     * 配送/自取时间
     */
    @TableField("`pdtime`")
    private Date pdtime;
    /**
     * 失效时间
     */
    @TableField("`ftime`")
    private Date ftime;

}
