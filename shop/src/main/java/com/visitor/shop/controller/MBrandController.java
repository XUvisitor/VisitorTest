package com.visitor.shop.controller;

import org.springframework.stereotype.Controller;
import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.visitor.common.annotation.Log;
import com.visitor.common.enums.BusinessType;
import com.visitor.shop.domain.MBrand;
import com.visitor.shop.service.IMBrandService;
import com.visitor.common.core.controller.BaseController;
import com.visitor.common.core.domain.AjaxResult;
import com.visitor.common.utils.poi.ExcelUtil;
import com.visitor.common.core.page.TableDataInfo;

/**
 * 品牌Controller
 * 
 * @author visitor
 * @date 2019-09-06
 */
@Controller
@RequestMapping("/shop/brand")
public class MBrandController extends BaseController
{
    private String prefix = "shop/brand";

    @Autowired
    private IMBrandService mBrandService;

    @RequiresPermissions("shop:brand:view")
    @GetMapping()
    public String brand()
    {
        return prefix + "/brand";
    }

    /**
     * 查询品牌列表
     */
    @RequiresPermissions("shop:brand:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MBrand mBrand)
    {
        startPage();
        List<MBrand> list = mBrandService.selectMBrandList(mBrand);
        return getDataTable(list);
    }

    /**
     * 导出品牌列表
     */
    @RequiresPermissions("shop:brand:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MBrand mBrand)
    {
        List<MBrand> list = mBrandService.selectMBrandList(mBrand);
        ExcelUtil<MBrand> util = new ExcelUtil<MBrand>(MBrand.class);
        return util.exportExcel(list, "brand");
    }

    /**
     * 新增品牌
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存品牌
     */
    @RequiresPermissions("shop:brand:add")
    @Log(title = "品牌", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MBrand mBrand)
    {
        return toAjax(mBrandService.insertMBrand(mBrand));
    }

    /**
     * 修改品牌
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        MBrand mBrand = mBrandService.selectMBrandById(id);
        mmap.put("mBrand", mBrand);
        return prefix + "/edit";
    }

    /**
     * 修改保存品牌
     */
    @RequiresPermissions("shop:brand:edit")
    @Log(title = "品牌", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MBrand mBrand)
    {
        return toAjax(mBrandService.updateMBrand(mBrand));
    }

    /**
     * 删除品牌
     */
    @RequiresPermissions("shop:brand:remove")
    @Log(title = "品牌", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(mBrandService.deleteMBrandByIds(ids));
    }
}
