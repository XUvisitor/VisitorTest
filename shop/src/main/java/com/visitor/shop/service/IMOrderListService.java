package com.visitor.shop.service;

import com.visitor.shop.domain.MOrderList;
import java.util.List;

/**
 * 订单Service接口
 * 
 * @author visitor
 * @date 2019-09-15
 */
public interface IMOrderListService 
{
    /**
     * 查询订单
     * 
     * @param orderListId 订单ID
     * @return 订单
     */
    public MOrderList selectMOrderListById(String orderListId);

    /**
     * 查询订单列表
     * 
     * @param mOrderList 订单
     * @return 订单集合
     */
    public List<MOrderList> selectMOrderListList(MOrderList mOrderList);

    /**
     * 新增订单
     * 
     * @param mOrderList 订单
     * @return 结果
     */
    public int insertMOrderList(MOrderList mOrderList);

    /**
     * 修改订单
     * 
     * @param mOrderList 订单
     * @return 结果
     */
    public int updateMOrderList(MOrderList mOrderList);

    /**
     * 批量删除订单
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMOrderListByIds(String ids);

    /**
     * 删除订单信息
     * 
     * @param orderListId 订单ID
     * @return 结果
     */
    public int deleteMOrderListById(String orderListId);
}
