package com.visitor.shop.domain;

import com.visitor.common.annotation.Excel;
import com.visitor.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * m_brand对象 m_brand
 * 
 * @author visitor
 * @date 2019-09-04
 */
public class MBrand extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 搜索值 */
    @Excel(name = "搜索值")
    private String searchValue;

    /** 品牌编号 */
    private Integer id;

    /** 品牌名称 */
    @Excel(name = "品牌名称")
    private String brandName;

    public void setSearchValue(String searchValue) 
    {
        this.searchValue = searchValue;
    }

    @Override
    public String getSearchValue()
    {
        return searchValue;
    }
    public void setId(Integer id)
    {
        this.id = id;
    }

    public Integer getId()
    {
        return id;
    }
    public void setBrandName(String brandName)
    {
        this.brandName = brandName;
    }

    public String getBrandName()
    {
        return brandName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("searchValue", getSearchValue())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .append("id", getId())
            .append("brandName", getBrandName())
            .toString();
    }
}
