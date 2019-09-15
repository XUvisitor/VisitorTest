package com.visitor.shop.controller;

import com.visitor.shop.service.IMBrandService;
import com.visitor.shop.service.IMTeamService;
import com.visitor.shop.service.IMUseService;
import org.springframework.stereotype.Controller;
import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.visitor.common.annotation.Log;
import com.visitor.common.enums.BusinessType;
import com.visitor.shop.domain.MProduct;
import com.visitor.shop.service.IMProductService;
import com.visitor.common.core.controller.BaseController;
import com.visitor.common.core.domain.AjaxResult;
import com.visitor.common.utils.poi.ExcelUtil;
import com.visitor.common.core.page.TableDataInfo;

/**
 * 商品Controller
 * 
 * @author visitor
 * @date 2019-09-11
 */
@Controller
@RequestMapping("/shop/product")
public class MProductController extends BaseController
{
    private String prefix = "shop/product";

    @Autowired
    private IMProductService mProductService;

    @Autowired
    private IMBrandService imBrandService;

    @Autowired
    private IMTeamService imTeamService;

    @Autowired
    private IMUseService imUseService;

    @RequiresPermissions("shop:product:view")
    @GetMapping()
    public String product()
    {
        return prefix + "/product";
    }

    /**
     * 查询商品列表
     */
    @RequiresPermissions("shop:product:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MProduct mProduct)
    {
        startPage();
        List<MProduct> list = mProductService.selectMProductList(mProduct);
        return getDataTable(list);
    }

    /**
     * 导出商品列表
     */
    @RequiresPermissions("shop:product:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MProduct mProduct)
    {
        List<MProduct> list = mProductService.selectMProductList(mProduct);
        ExcelUtil<MProduct> util = new ExcelUtil<MProduct>(MProduct.class);
        return util.exportExcel(list, "product");
    }

    /**
     * 新增商品
     */
    @GetMapping("/add")
    public String add(ModelMap modelMap) {
        modelMap.addAttribute("teamList", imTeamService.selectMTeamList(null));
        modelMap.addAttribute("useList", imUseService.selectMUseList(null));
        modelMap.addAttribute("brandList", imBrandService.selectMBrandList(null));
        return prefix + "/add";
    }

    /**
     * 新增保存商品
     */
    @RequiresPermissions("shop:product:add")
    @Log(title = "商品", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MProduct mProduct)
    {
        return toAjax(mProductService.insertMProduct(mProduct));
    }

    /**
     * 修改商品
     */
    @GetMapping("/edit/{productId}")
    public String edit(@PathVariable("productId") Integer productId, ModelMap modelMap)
    {
        MProduct mProduct = mProductService.selectMProductById(productId);
        modelMap.addAttribute("teamList", imTeamService.selectMTeamList(null));
        modelMap.addAttribute("useList", imUseService.selectMUseList(null));
        modelMap.addAttribute("brandList", imBrandService.selectMBrandList(null));
        modelMap.put("mProduct", mProduct);
        return prefix + "/edit";
    }

    /**
     * 修改保存商品
     */
    @RequiresPermissions("shop:product:edit")
    @Log(title = "商品", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MProduct mProduct)
    {
        return toAjax(mProductService.updateMProduct(mProduct));
    }

    /**
     * 删除商品
     */
    @RequiresPermissions("shop:product:remove")
    @Log(title = "商品", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(mProductService.deleteMProductByIds(ids));
    }

    @RequiresPermissions("shop:product:image")
    @RequestMapping("/image/{productId}")
    public String image() {
        return "/image";
    }
}
