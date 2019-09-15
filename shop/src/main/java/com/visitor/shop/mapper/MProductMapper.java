package com.visitor.shop.mapper;

import com.visitor.shop.domain.MProduct;
import java.util.List;

/**
 * 商品Mapper接口
 * 
 * @author visitor
 * @date 2019-09-11
 */
public interface MProductMapper 
{
    /**
     * 查询商品
     * 
     * @param productId 商品ID
     * @return 商品
     */
    public MProduct selectMProductById(Integer productId);

    /**
     * 查询商品列表
     * 
     * @param mProduct 商品
     * @return 商品集合
     */
    public List<MProduct> selectMProductList(MProduct mProduct);

    /**
     * 新增商品
     * 
     * @param mProduct 商品
     * @return 结果
     */
    public int insertMProduct(MProduct mProduct);

    /**
     * 修改商品
     * 
     * @param mProduct 商品
     * @return 结果
     */
    public int updateMProduct(MProduct mProduct);

    /**
     * 删除商品
     * 
     * @param productId 商品ID
     * @return 结果
     */
    public int deleteMProductById(Integer productId);

    /**
     * 批量删除商品
     * 
     * @param productIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteMProductByIds(String[] productIds);

}
