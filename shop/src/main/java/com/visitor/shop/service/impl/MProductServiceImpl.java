package com.visitor.shop.service.impl;

import java.util.List;
import com.visitor.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.visitor.shop.mapper.MProductMapper;
import com.visitor.shop.domain.MProduct;
import com.visitor.shop.service.IMProductService;
import com.visitor.common.core.text.Convert;

/**
 * 商品Service业务层处理
 * 
 * @author visitor
 * @date 2019-09-11
 */
@Service
public class MProductServiceImpl implements IMProductService 
{
    @Autowired
    private MProductMapper mProductMapper;

    /**
     * 查询商品
     * 
     * @param productId 商品ID
     * @return 商品
     */
    @Override
    public MProduct selectMProductById(Integer productId)
    {
        return mProductMapper.selectMProductById(productId);
    }

    /**
     * 查询商品列表
     * 
     * @param mProduct 商品
     * @return 商品
     */
    @Override
    public List<MProduct> selectMProductList(MProduct mProduct)
    {
        return mProductMapper.selectMProductList(mProduct);
    }

    /**
     * 新增商品
     * 
     * @param mProduct 商品
     * @return 结果
     */
    @Override
    public int insertMProduct(MProduct mProduct)
    {
        mProduct.setCreateTime(DateUtils.getNowDate());
        return mProductMapper.insertMProduct(mProduct);
    }

    /**
     * 修改商品
     * 
     * @param mProduct 商品
     * @return 结果
     */
    @Override
    public int updateMProduct(MProduct mProduct)
    {
        mProduct.setUpdateTime(DateUtils.getNowDate());
        return mProductMapper.updateMProduct(mProduct);
    }

    /**
     * 删除商品对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMProductByIds(String ids)
    {
        return mProductMapper.deleteMProductByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除商品信息
     * 
     * @param productId 商品ID
     * @return 结果
     */
    public int deleteMProductById(Integer productId)
    {
        return mProductMapper.deleteMProductById(productId);
    }
}
