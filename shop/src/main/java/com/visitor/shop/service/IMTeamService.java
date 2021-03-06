package com.visitor.shop.service;

import com.visitor.shop.domain.MTeam;
import java.util.List;

/**
 * 队伍Service接口
 * 
 * @author visitor
 * @date 2019-09-06
 */
public interface IMTeamService 
{
    /**
     * 查询队伍
     * 
     * @param teamId 队伍ID
     * @return 队伍
     */
    public MTeam selectMTeamById(Integer teamId);

    /**
     * 查询队伍列表
     * 
     * @param mTeam 队伍
     * @return 队伍集合
     */
    public List<MTeam> selectMTeamList(MTeam mTeam);

    /**
     * 新增队伍
     * 
     * @param mTeam 队伍
     * @return 结果
     */
    public int insertMTeam(MTeam mTeam);

    /**
     * 修改队伍
     * 
     * @param mTeam 队伍
     * @return 结果
     */
    public int updateMTeam(MTeam mTeam);

    /**
     * 批量删除队伍
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMTeamByIds(String ids);

    /**
     * 删除队伍信息
     * 
     * @param teamId 队伍ID
     * @return 结果
     */
    public int deleteMTeamById(Integer teamId);
}
