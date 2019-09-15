package com.visitor.shop.service.impl;

import java.util.List;
import com.visitor.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.visitor.shop.mapper.MInventoryMapper;
import com.visitor.shop.domain.MInventory;
import com.visitor.shop.service.IMInventoryService;
import com.visitor.common.core.text.Convert;

/**
 * 库存Service业务层处理
 * 
 * @author visitor
 * @date 2019-09-15
 */
@Service
public class MInventoryServiceImpl implements IMInventoryService 
{
    @Autowired
    private MInventoryMapper mInventoryMapper;

    /**
     * 查询库存
     * 
     * @param inventoryId 库存ID
     * @return 库存
     */
    @Override
    public MInventory selectMInventoryById(Integer inventoryId)
    {
        return mInventoryMapper.selectMInventoryById(inventoryId);
    }

    /**
     * 查询库存列表
     * 
     * @param mInventory 库存
     * @return 库存
     */
    @Override
    public List<MInventory> selectMInventoryList(MInventory mInventory)
    {
        return mInventoryMapper.selectMInventoryList(mInventory);
    }

    /**
     * 新增库存
     * 
     * @param mInventory 库存
     * @return 结果
     */
    @Override
    public int insertMInventory(MInventory mInventory)
    {
        mInventory.setCreateTime(DateUtils.getNowDate());
        return mInventoryMapper.insertMInventory(mInventory);
    }

    /**
     * 修改库存
     * 
     * @param mInventory 库存
     * @return 结果
     */
    @Override
    public int updateMInventory(MInventory mInventory)
    {
        mInventory.setUpdateTime(DateUtils.getNowDate());
        return mInventoryMapper.updateMInventory(mInventory);
    }

    /**
     * 删除库存对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMInventoryByIds(String ids)
    {
        return mInventoryMapper.deleteMInventoryByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除库存信息
     * 
     * @param inventoryId 库存ID
     * @return 结果
     */
    public int deleteMInventoryById(Integer inventoryId)
    {
        return mInventoryMapper.deleteMInventoryById(inventoryId);
    }
}
