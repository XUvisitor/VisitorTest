package com.visitor.shop.domain;

import com.visitor.common.core.domain.BaseEntity;
import com.visitor.common.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 订单对象 m_order_list
 * 
 * @author visitor
 * @date 2019-09-15
 */
public class MOrderList extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 订单编号 */
    private String orderListId;

    /** 订单状态 */
    @Excel(name = "订单状态")
    private String orderListCondition;

    /** 商品编号 */
    @Excel(name = "商品编号")
    private String orderListProductId;

    /** 购买用户 */
    @Excel(name = "购买用户")
    private String orderListBuyerId;

    /** 收获状态 */
    @Excel(name = "收获状态")
    private String orderListTake;

    /** 订单金额 */
    @Excel(name = "订单金额")
    private Long orderListAmount;

    public void setOrderListId(String orderListId) 
    {
        this.orderListId = orderListId;
    }

    public String getOrderListId() 
    {
        return orderListId;
    }
    public void setOrderListCondition(String orderListCondition) 
    {
        this.orderListCondition = orderListCondition;
    }

    public String getOrderListCondition() 
    {
        return orderListCondition;
    }
    public void setOrderListProductId(String orderListProductId) 
    {
        this.orderListProductId = orderListProductId;
    }

    public String getOrderListProductId() 
    {
        return orderListProductId;
    }
    public void setOrderListBuyerId(String orderListBuyerId) 
    {
        this.orderListBuyerId = orderListBuyerId;
    }

    public String getOrderListBuyerId() 
    {
        return orderListBuyerId;
    }
    public void setOrderListTake(String orderListTake) 
    {
        this.orderListTake = orderListTake;
    }

    public String getOrderListTake() 
    {
        return orderListTake;
    }
    public void setOrderListAmount(Long orderListAmount) 
    {
        this.orderListAmount = orderListAmount;
    }

    public Long getOrderListAmount() 
    {
        return orderListAmount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("orderListId", getOrderListId())
            .append("orderListCondition", getOrderListCondition())
            .append("orderListProductId", getOrderListProductId())
            .append("orderListBuyerId", getOrderListBuyerId())
            .append("orderListTake", getOrderListTake())
            .append("orderListAmount", getOrderListAmount())
            .toString();
    }
}
