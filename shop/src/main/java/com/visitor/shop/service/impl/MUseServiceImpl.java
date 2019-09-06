package com.visitor.shop.service.impl;

import java.util.List;
import com.visitor.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.visitor.shop.mapper.MUseMapper;
import com.visitor.shop.domain.MUse;
import com.visitor.shop.service.IMUseService;
import com.visitor.common.core.text.Convert;

/**
 * 用途Service业务层处理
 * 
 * @author visitor
 * @date 2019-09-06
 */
@Service
public class MUseServiceImpl implements IMUseService 
{
    @Autowired
    private MUseMapper mUseMapper;

    /**
     * 查询用途
     * 
     * @param useId 用途ID
     * @return 用途
     */
    @Override
    public MUse selectMUseById(Integer useId)
    {
        return mUseMapper.selectMUseById(useId);
    }

    /**
     * 查询用途列表
     * 
     * @param mUse 用途
     * @return 用途
     */
    @Override
    public List<MUse> selectMUseList(MUse mUse)
    {
        return mUseMapper.selectMUseList(mUse);
    }

    /**
     * 新增用途
     * 
     * @param mUse 用途
     * @return 结果
     */
    @Override
    public int insertMUse(MUse mUse)
    {
        mUse.setCreateTime(DateUtils.getNowDate());
        return mUseMapper.insertMUse(mUse);
    }

    /**
     * 修改用途
     * 
     * @param mUse 用途
     * @return 结果
     */
    @Override
    public int updateMUse(MUse mUse)
    {
        mUse.setUpdateTime(DateUtils.getNowDate());
        return mUseMapper.updateMUse(mUse);
    }

    /**
     * 删除用途对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMUseByIds(String ids)
    {
        return mUseMapper.deleteMUseByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除用途信息
     * 
     * @param useId 用途ID
     * @return 结果
     */
    public int deleteMUseById(Integer useId)
    {
        return mUseMapper.deleteMUseById(useId);
    }
}
