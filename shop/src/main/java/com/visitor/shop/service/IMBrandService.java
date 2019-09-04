package com.visitor.shop.service;

import com.visitor.shop.domain.MBrand;
import java.util.List;

/**
 * m_brandService接口
 * 
 * @author visitor
 * @date 2019-09-04
 */
public interface IMBrandService 
{
    /**
     * 查询m_brand
     * 
     * @param id m_brandID
     * @return m_brand
     */
    public MBrand selectMBrandById(Integer id);

    /**
     * 查询m_brand列表
     * 
     * @param mBrand m_brand
     * @return m_brand集合
     */
    public List<MBrand> selectMBrandList(MBrand mBrand);

    /**
     * 新增m_brand
     * 
     * @param mBrand m_brand
     * @return 结果
     */
    public int insertMBrand(MBrand mBrand);

    /**
     * 修改m_brand
     * 
     * @param mBrand m_brand
     * @return 结果
     */
    public int updateMBrand(MBrand mBrand);

    /**
     * 批量删除m_brand
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMBrandByIds(String ids);

    /**
     * 删除m_brand信息
     * 
     * @param id m_brandID
     * @return 结果
     */
    public int deleteMBrandById(Integer id);
}
