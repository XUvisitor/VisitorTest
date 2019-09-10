package com.visitor.shop.domain;

import com.visitor.common.core.domain.BaseEntity;
import com.visitor.common.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 商品对象 m_product
 * 
 * @author visitor
 * @date 2019-09-09
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
    private String describe;

    /** 产品图片 */
    @Excel(name = "产品图片")
    private String image;

    /** 产品品牌 */
    @Excel(name = "产品品牌")
    private Integer brandId;

    /** 所属队伍 */
    @Excel(name = "所属队伍")
    private Integer teamId;

    /** 产品用途 */
    @Excel(name = "产品用途")
    private Integer useId;

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
    public void setDescribe(String describe) 
    {
        this.describe = describe;
    }

    public String getDescribe() 
    {
        return describe;
    }
    public void setImage(String image) 
    {
        this.image = image;
    }

    public String getImage() 
    {
        return image;
    }
    public void setBrandId(Integer brandId) 
    {
        this.brandId = brandId;
    }

    public Integer getBrandId() 
    {
        return brandId;
    }
    public void setTeamId(Integer teamId) 
    {
        this.teamId = teamId;
    }

    public Integer getTeamId() 
    {
        return teamId;
    }
    public void setUseId(Integer useId) 
    {
        this.useId = useId;
    }

    public Integer getUseId() 
    {
        return useId;
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
            .append("describe", getDescribe())
            .append("image", getImage())
            .append("brandId", getBrandId())
            .append("teamId", getTeamId())
            .append("useId", getUseId())
            .toString();
    }
}
