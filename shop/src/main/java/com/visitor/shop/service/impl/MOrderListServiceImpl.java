package com.visitor.shop.service.impl;

import java.util.List;
import com.visitor.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.visitor.shop.mapper.MOrderListMapper;
import com.visitor.shop.domain.MOrderList;
import com.visitor.shop.service.IMOrderListService;
import com.visitor.common.core.text.Convert;

/**
 * 订单Service业务层处理
 * 
 * @author visitor
 * @date 2019-09-15
 */
@Service
public class MOrderListServiceImpl implements IMOrderListService 
{
    @Autowired
    private MOrderListMapper mOrderListMapper;

    /**
     * 查询订单
     * 
     * @param orderListId 订单ID
     * @return 订单
     */
    @Override
    public MOrderList selectMOrderListById(String orderListId)
    {
        return mOrderListMapper.selectMOrderListById(orderListId);
    }

    /**
     * 查询订单列表
     * 
     * @param mOrderList 订单
     * @return 订单
     */
    @Override
    public List<MOrderList> selectMOrderListList(MOrderList mOrderList)
    {
        return mOrderListMapper.selectMOrderListList(mOrderList);
    }

    /**
     * 新增订单
     * 
     * @param mOrderList 订单
     * @return 结果
     */
    @Override
    public int insertMOrderList(MOrderList mOrderList)
    {
        mOrderList.setCreateTime(DateUtils.getNowDate());
        return mOrderListMapper.insertMOrderList(mOrderList);
    }

    /**
     * 修改订单
     * 
     * @param mOrderList 订单
     * @return 结果
     */
    @Override
    public int updateMOrderList(MOrderList mOrderList)
    {
        mOrderList.setUpdateTime(DateUtils.getNowDate());
        return mOrderListMapper.updateMOrderList(mOrderList);
    }

    /**
     * 删除订单对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMOrderListByIds(String ids)
    {
        return mOrderListMapper.deleteMOrderListByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除订单信息
     * 
     * @param orderListId 订单ID
     * @return 结果
     */
    public int deleteMOrderListById(String orderListId)
    {
        return mOrderListMapper.deleteMOrderListById(orderListId);
    }
}
