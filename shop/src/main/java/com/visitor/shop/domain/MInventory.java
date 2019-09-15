package com.visitor.shop.domain;

import com.visitor.common.core.domain.BaseEntity;
import com.visitor.common.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 库存对象 m_inventory
 * 
 * @author visitor
 * @date 2019-09-15
 */
public class MInventory extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 库存编号 */
    private Integer inventoryId;

    /** 码数 */
    @Excel(name = "码数")
    private String productSize;

    /** 数量 */
    @Excel(name = "数量")
    private Integer productNumber;

    /** 商品编号 */
    @Excel(name = "商品编号")
    private String inventoryProductId;

    public void setInventoryId(Integer inventoryId) 
    {
        this.inventoryId = inventoryId;
    }

    public Integer getInventoryId() 
    {
        return inventoryId;
    }
    public void setProductSize(String productSize) 
    {
        this.productSize = productSize;
    }

    public String getProductSize() 
    {
        return productSize;
    }
    public void setProductNumber(Integer productNumber) 
    {
        this.productNumber = productNumber;
    }

    public Integer getProductNumber() 
    {
        return productNumber;
    }
    public void setInventoryProductId(String inventoryProductId) 
    {
        this.inventoryProductId = inventoryProductId;
    }

    public String getInventoryProductId() 
    {
        return inventoryProductId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("inventoryId", getInventoryId())
            .append("productSize", getProductSize())
            .append("productNumber", getProductNumber())
            .append("inventoryProductId", getInventoryProductId())
            .toString();
    }
}
