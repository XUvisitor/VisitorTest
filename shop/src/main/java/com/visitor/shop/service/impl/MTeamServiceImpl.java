package com.visitor.shop.service.impl;

import java.util.List;
import com.visitor.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.visitor.shop.mapper.MTeamMapper;
import com.visitor.shop.domain.MTeam;
import com.visitor.shop.service.IMTeamService;
import com.visitor.common.core.text.Convert;

/**
 * 队伍Service业务层处理
 * 
 * @author visitor
 * @date 2019-09-05
 */
@Service
public class MTeamServiceImpl implements IMTeamService 
{
    @Autowired
    private MTeamMapper mTeamMapper;

    /**
     * 查询队伍
     * 
     * @param teamId 队伍ID
     * @return 队伍
     */
    @Override
    public MTeam selectMTeamById(Integer teamId)
    {
        return mTeamMapper.selectMTeamById(teamId);
    }

    /**
     * 查询队伍列表
     * 
     * @param mTeam 队伍
     * @return 队伍
     */
    @Override
    public List<MTeam> selectMTeamList(MTeam mTeam)
    {
        return mTeamMapper.selectMTeamList(mTeam);
    }

    /**
     * 新增队伍
     * 
     * @param mTeam 队伍
     * @return 结果
     */
    @Override
    public int insertMTeam(MTeam mTeam)
    {
        mTeam.setCreateTime(DateUtils.getNowDate());
        return mTeamMapper.insertMTeam(mTeam);
    }

    /**
     * 修改队伍
     * 
     * @param mTeam 队伍
     * @return 结果
     */
    @Override
    public int updateMTeam(MTeam mTeam)
    {
        mTeam.setUpdateTime(DateUtils.getNowDate());
        return mTeamMapper.updateMTeam(mTeam);
    }

    /**
     * 删除队伍对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMTeamByIds(String ids)
    {
        return mTeamMapper.deleteMTeamByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除队伍信息
     * 
     * @param teamId 队伍ID
     * @return 结果
     */
    public int deleteMTeamById(Integer teamId)
    {
        return mTeamMapper.deleteMTeamById(teamId);
    }
}
