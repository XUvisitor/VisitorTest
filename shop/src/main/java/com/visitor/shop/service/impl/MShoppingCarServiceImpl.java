package com.visitor.shop.service.impl;

import java.util.List;
import com.visitor.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.visitor.shop.mapper.MShoppingCarMapper;
import com.visitor.shop.domain.MShoppingCar;
import com.visitor.shop.service.IMShoppingCarService;
import com.visitor.common.core.text.Convert;

/**
 * 购物车Service业务层处理
 * 
 * @author visitor
 * @date 2019-09-15
 */
@Service
public class MShoppingCarServiceImpl implements IMShoppingCarService 
{
    @Autowired
    private MShoppingCarMapper mShoppingCarMapper;

    /**
     * 查询购物车
     * 
     * @param shoppingCarId 购物车ID
     * @return 购物车
     */
    @Override
    public MShoppingCar selectMShoppingCarById(Integer shoppingCarId)
    {
        return mShoppingCarMapper.selectMShoppingCarById(shoppingCarId);
    }

    /**
     * 查询购物车列表
     * 
     * @param mShoppingCar 购物车
     * @return 购物车
     */
    @Override
    public List<MShoppingCar> selectMShoppingCarList(MShoppingCar mShoppingCar)
    {
        return mShoppingCarMapper.selectMShoppingCarList(mShoppingCar);
    }

    /**
     * 新增购物车
     * 
     * @param mShoppingCar 购物车
     * @return 结果
     */
    @Override
    public int insertMShoppingCar(MShoppingCar mShoppingCar)
    {
        mShoppingCar.setCreateTime(DateUtils.getNowDate());
        return mShoppingCarMapper.insertMShoppingCar(mShoppingCar);
    }

    /**
     * 修改购物车
     * 
     * @param mShoppingCar 购物车
     * @return 结果
     */
    @Override
    public int updateMShoppingCar(MShoppingCar mShoppingCar)
    {
        mShoppingCar.setUpdateTime(DateUtils.getNowDate());
        return mShoppingCarMapper.updateMShoppingCar(mShoppingCar);
    }

    /**
     * 删除购物车对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMShoppingCarByIds(String ids)
    {
        return mShoppingCarMapper.deleteMShoppingCarByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除购物车信息
     * 
     * @param shoppingCarId 购物车ID
     * @return 结果
     */
    public int deleteMShoppingCarById(Integer shoppingCarId)
    {
        return mShoppingCarMapper.deleteMShoppingCarById(shoppingCarId);
    }
}
