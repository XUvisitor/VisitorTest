package com.visitor.shop.mapper;

import com.visitor.shop.domain.MShoppingCar;
import java.util.List;

/**
 * 购物车Mapper接口
 * 
 * @author visitor
 * @date 2019-09-15
 */
public interface MShoppingCarMapper 
{
    /**
     * 查询购物车
     * 
     * @param shoppingCarId 购物车ID
     * @return 购物车
     */
    public MShoppingCar selectMShoppingCarById(Integer shoppingCarId);

    /**
     * 查询购物车列表
     * 
     * @param mShoppingCar 购物车
     * @return 购物车集合
     */
    public List<MShoppingCar> selectMShoppingCarList(MShoppingCar mShoppingCar);

    /**
     * 新增购物车
     * 
     * @param mShoppingCar 购物车
     * @return 结果
     */
    public int insertMShoppingCar(MShoppingCar mShoppingCar);

    /**
     * 修改购物车
     * 
     * @param mShoppingCar 购物车
     * @return 结果
     */
    public int updateMShoppingCar(MShoppingCar mShoppingCar);

    /**
     * 删除购物车
     * 
     * @param shoppingCarId 购物车ID
     * @return 结果
     */
    public int deleteMShoppingCarById(Integer shoppingCarId);

    /**
     * 批量删除购物车
     * 
     * @param shoppingCarIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteMShoppingCarByIds(String[] shoppingCarIds);
}
