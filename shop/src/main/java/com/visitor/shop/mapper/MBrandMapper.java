package com.visitor.shop.mapper;

import com.visitor.shop.domain.MBrand;
import java.util.List;

/**
 * 品牌Mapper接口
 * 
 * @author visitor
 * @date 2019-09-06
 */
public interface MBrandMapper 
{
    /**
     * 查询品牌
     * 
     * @param id 品牌ID
     * @return 品牌
     */
    public MBrand selectMBrandById(Integer id);

    /**
     * 查询品牌列表
     * 
     * @param mBrand 品牌
     * @return 品牌集合
     */
    public List<MBrand> selectMBrandList(MBrand mBrand);

    /**
     * 新增品牌
     * 
     * @param mBrand 品牌
     * @return 结果
     */
    public int insertMBrand(MBrand mBrand);

    /**
     * 修改品牌
     * 
     * @param mBrand 品牌
     * @return 结果
     */
    public int updateMBrand(MBrand mBrand);

    /**
     * 删除品牌
     * 
     * @param id 品牌ID
     * @return 结果
     */
    public int deleteMBrandById(Integer id);

    /**
     * 批量删除品牌
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteMBrandByIds(String[] ids);
}
