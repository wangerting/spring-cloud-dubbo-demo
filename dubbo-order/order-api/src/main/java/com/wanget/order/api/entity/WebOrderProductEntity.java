package com.wanget.order.api.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wanget.order.api.enums.DeliveryStatusEnum;
import com.wanget.order.api.enums.OrderStatusEnum;
import com.wanget.order.api.enums.RefundStatusEnum;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单与产品关联表(WebOrderProduct)表实体类
 *
 * @author Erting.Wang
 * @since 2021-07-19 12:01:52
 */
@Data
@TableName("web_order_product")
public class WebOrderProductEntity implements Serializable {
    private static final long serialVersionUID = -1L;

    @TableId(value = "`id`", type = IdType.AUTO)
    private Integer id;

    @TableField("`order_id`")
    private Integer orderId;
    /**
     * 产品id
     */
    @TableField("`product_id`")
    private Integer productId;
    /**
     * 店铺id
     */
    @TableField("`shop_id`")
    private Integer shopId;

    @TableField("`user_id`")
    private Integer userId;
    /**
     * 配送员
     */
    @TableField("`delivery_id`")
    private Integer deliveryId;

    @TableField("`product_name`")
    private String productName;
    /**
     * 个数
     */
    @TableField("`quantity`")
    private Integer quantity;
    /**
     * 金额
     */
    @TableField("`amount`")
    private BigDecimal amount;
    /**
     * 实付金额
     */
    @TableField("`amount_payable`")
    private BigDecimal amountPayable;

    @TableField("`ctime`")
    private Date ctime;

    @TableField("`utime`")
    private Date utime;
    /**
     * 开始配送时间
     */
    @TableField("`stime`")
    private Date stime;
    /**
     * 配送完成时间
     */
    @TableField("`etime`")
    private Date etime;

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

}
