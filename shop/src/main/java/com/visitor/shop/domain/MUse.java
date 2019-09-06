package com.visitor.shop.domain;

import com.visitor.common.core.domain.BaseEntity;
import com.visitor.common.annotation.Excel;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 用途对象 m_use
 * 
 * @author visitor
 * @date 2019-09-06
 */
public class MUse extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 用途编号 */
    private Integer useId;

    /** 用途名称 */
    @Excel(name = "用途名称")
    private String useName;

    public void setUseId(Integer useId) 
    {
        this.useId = useId;
    }

    public Integer getUseId() 
    {
        return useId;
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
            .append("useId", getUseId())
            .append("useName", getUseName())
            .toString();
    }
}
