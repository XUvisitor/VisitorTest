package com.visitor.shop.domain;

import com.visitor.common.core.domain.BaseEntity;
import com.visitor.common.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 购物车对象 m_shopping_car
 * 
 * @author visitor
 * @date 2019-09-15
 */
public class MShoppingCar extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 购物车编号 */
    private Integer shoppingCarId;

    /** 商品编号 */
    @Excel(name = "商品编号")
    private String shoppingProductId;

    /** 所属用户 */
    @Excel(name = "所属用户")
    private Integer userId;

    /** 购物数量 */
    @Excel(name = "购物数量")
    private Integer count;

    public void setShoppingCarId(Integer shoppingCarId) 
    {
        this.shoppingCarId = shoppingCarId;
    }

    public Integer getShoppingCarId() 
    {
        return shoppingCarId;
    }
    public void setShoppingProductId(String shoppingProductId) 
    {
        this.shoppingProductId = shoppingProductId;
    }

    public String getShoppingProductId() 
    {
        return shoppingProductId;
    }
    public void setUserId(Integer userId) 
    {
        this.userId = userId;
    }

    public Integer getUserId() 
    {
        return userId;
    }
    public void setCount(Integer count) 
    {
        this.count = count;
    }

    public Integer getCount() 
    {
        return count;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("shoppingCarId", getShoppingCarId())
            .append("shoppingProductId", getShoppingProductId())
            .append("userId", getUserId())
            .append("count", getCount())
            .toString();
    }
}
