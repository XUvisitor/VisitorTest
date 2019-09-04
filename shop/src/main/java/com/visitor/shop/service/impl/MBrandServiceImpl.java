package com.visitor.shop.service.impl;

import java.util.List;
import com.visitor.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.visitor.shop.mapper.MBrandMapper;
import com.visitor.shop.domain.MBrand;
import com.visitor.shop.service.IMBrandService;
import com.visitor.common.core.text.Convert;

/**
 * m_brandService业务层处理
 * 
 * @author visitor
 * @date 2019-09-04
 */
@Service
public class MBrandServiceImpl implements IMBrandService 
{
    @Autowired
    private MBrandMapper mBrandMapper;

    /**
     * 查询m_brand
     * 
     * @param id m_brandID
     * @return m_brand
     */
    @Override
    public MBrand selectMBrandById(Integer id)
    {
        return mBrandMapper.selectMBrandById(id);
    }

    /**
     * 查询m_brand列表
     * 
     * @param mBrand m_brand
     * @return m_brand
     */
    @Override
    public List<MBrand> selectMBrandList(MBrand mBrand)
    {
        return mBrandMapper.selectMBrandList(mBrand);
    }

    /**
     * 新增m_brand
     * 
     * @param mBrand m_brand
     * @return 结果
     */
    @Override
    public int insertMBrand(MBrand mBrand)
    {
        mBrand.setCreateTime(DateUtils.getNowDate());
        return mBrandMapper.insertMBrand(mBrand);
    }

    /**
     * 修改m_brand
     * 
     * @param mBrand m_brand
     * @return 结果
     */
    @Override
    public int updateMBrand(MBrand mBrand)
    {
        mBrand.setUpdateTime(DateUtils.getNowDate());
        return mBrandMapper.updateMBrand(mBrand);
    }

    /**
     * 删除m_brand对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteMBrandByIds(String ids)
    {
        return mBrandMapper.deleteMBrandByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除m_brand信息
     * 
     * @param id m_brandID
     * @return 结果
     */
    public int deleteMBrandById(Integer id)
    {
        return mBrandMapper.deleteMBrandById(id);
    }
}
