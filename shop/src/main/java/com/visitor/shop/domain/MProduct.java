package com.visitor.shop.domain;

import com.visitor.common.core.domain.BaseEntity;
import com.visitor.common.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * m_product对象 m_product
 * 
 * @author visitor
 * @date 2019-09-13
 */
public class MProduct extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 产品编号 */
    private Integer productId;

    /** 产品名称 */
    @Excel(name = "产品名称")
    private String productName;

    /** 产品价格 */
    @Excel(name = "产品价格")
    private String price;

    /** 产品描述 */
    @Excel(name = "产品描述")
    private String productDescribe;

    /** 产品图片 */
    @Excel(name = "产品图片")
    private String image;

    /** 产品品牌 */
    @Excel(name = "产品品牌")
    private String brandName;

    /** 所属队伍 */
    @Excel(name = "所属队伍")
    private String teamName;

    /** 产品用途 */
    @Excel(name = "产品用途")
    private String useName;

    public void setProductId(Integer productId)
    {
        this.productId = productId;
    }

    public Integer getProductId()
    {
        return productId;
    }
    public void setProductName(String productName) 
    {
        this.productName = productName;
    }

    public String getProductName() 
    {
        return productName;
    }
    public void setPrice(String price) 
    {
        this.price = price;
    }

    public String getPrice() 
    {
        return price;
    }
    public void setProductDescribe(String productDescribe) 
    {
        this.productDescribe = productDescribe;
    }

    public String getProductDescribe() 
    {
        return productDescribe;
    }
    public void setImage(String image) 
    {
        this.image = image;
    }

    public String getImage() 
    {
        return image;
    }
    public void setBrandName(String brandName) 
    {
        this.brandName = brandName;
    }

    public String getBrandName() 
    {
        return brandName;
    }
    public void setTeamName(String teamName) 
    {
        this.teamName = teamName;
    }

    public String getTeamName() 
    {
        return teamName;
    }
    public void setUseName(String useName) 
    {
        this.useName = useName;
    }

    public String getUseName() 
    {
        return useName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("productId", getProductId())
            .append("productName", getProductName())
            .append("price", getPrice())
            .append("productDescribe", getProductDescribe())
            .append("image", getImage())
            .append("brandName", getBrandName())
            .append("teamName", getTeamName())
            .append("useName", getUseName())
            .toString();
    }
}
