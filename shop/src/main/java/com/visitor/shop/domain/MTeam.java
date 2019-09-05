package com.visitor.shop.domain;

import com.visitor.common.annotation.Excel;
import com.visitor.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 队伍对象 m_team
 * 
 * @author visitor
 * @date 2019-09-05
 */
public class MTeam extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 搜索值 */
    @Excel(name = "搜索值")
    private String searchValue;

    /** 队伍编号 */
    private Integer teamId;

    /** 队伍名称 */
    @Excel(name = "队伍名称")
    private String teamName;

    @Override
    public void setSearchValue(String searchValue)
    {
        this.searchValue = searchValue;
    }

    @Override
    public String getSearchValue()
    {
        return searchValue;
    }
    public void setTeamId(Integer teamId) 
    {
        this.teamId = teamId;
    }

    public Integer getTeamId() 
    {
        return teamId;
    }
    public void setTeamName(String teamName) 
    {
        this.teamName = teamName;
    }

    public String getTeamName() 
    {
        return teamName;
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
            .append("teamId", getTeamId())
            .append("teamName", getTeamName())
            .toString();
    }
}
