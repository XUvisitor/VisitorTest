package com.visitor.shop.mapper;

import com.visitor.shop.domain.MInventory;
import java.util.List;

/**
 * 库存Mapper接口
 * 
 * @author visitor
 * @date 2019-09-15
 */
public interface MInventoryMapper 
{
    /**
     * 查询库存
     * 
     * @param inventoryId 库存ID
     * @return 库存
     */
    public MInventory selectMInventoryById(Integer inventoryId);

    /**
     * 查询库存列表
     * 
     * @param mInventory 库存
     * @return 库存集合
     */
    public List<MInventory> selectMInventoryList(MInventory mInventory);

    /**
     * 新增库存
     * 
     * @param mInventory 库存
     * @return 结果
     */
    public int insertMInventory(MInventory mInventory);

    /**
     * 修改库存
     * 
     * @param mInventory 库存
     * @return 结果
     */
    public int updateMInventory(MInventory mInventory);

    /**
     * 删除库存
     * 
     * @param inventoryId 库存ID
     * @return 结果
     */
    public int deleteMInventoryById(Integer inventoryId);

    /**
     * 批量删除库存
     * 
     * @param inventoryIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteMInventoryByIds(String[] inventoryIds);
}
