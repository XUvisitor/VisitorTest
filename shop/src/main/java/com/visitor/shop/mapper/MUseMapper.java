package com.visitor.shop.mapper;

import com.visitor.shop.domain.MUse;
import java.util.List;

/**
 * 用途Mapper接口
 * 
 * @author visitor
 * @date 2019-09-06
 */
public interface MUseMapper 
{
    /**
     * 查询用途
     * 
     * @param useId 用途ID
     * @return 用途
     */
    public MUse selectMUseById(Integer useId);

    /**
     * 查询用途列表
     * 
     * @param mUse 用途
     * @return 用途集合
     */
    public List<MUse> selectMUseList(MUse mUse);

    /**
     * 新增用途
     * 
     * @param mUse 用途
     * @return 结果
     */
    public int insertMUse(MUse mUse);

    /**
     * 修改用途
     * 
     * @param mUse 用途
     * @return 结果
     */
    public int updateMUse(MUse mUse);

    /**
     * 删除用途
     * 
     * @param useId 用途ID
     * @return 结果
     */
    public int deleteMUseById(Integer useId);

    /**
     * 批量删除用途
     * 
     * @param useIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteMUseByIds(String[] useIds);
}
