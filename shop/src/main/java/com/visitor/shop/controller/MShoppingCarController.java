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
import com.visitor.shop.domain.MShoppingCar;
import com.visitor.shop.service.IMShoppingCarService;
import com.visitor.common.core.controller.BaseController;
import com.visitor.common.core.domain.AjaxResult;
import com.visitor.common.utils.poi.ExcelUtil;
import com.visitor.common.core.page.TableDataInfo;

/**
 * 购物车Controller
 * 
 * @author visitor
 * @date 2019-09-15
 */
@Controller
@RequestMapping("/shop/shoppingcar")
public class MShoppingCarController extends BaseController
{
    private String prefix = "shop/shoppingcar";

    @Autowired
    private IMShoppingCarService mShoppingCarService;

    @RequiresPermissions("shop:shoppingcar:view")
    @GetMapping()
    public String shoppingcar()
    {
        return prefix + "/shoppingcar";
    }

    /**
     * 查询购物车列表
     */
    @RequiresPermissions("shop:shoppingcar:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MShoppingCar mShoppingCar)
    {
        startPage();
        List<MShoppingCar> list = mShoppingCarService.selectMShoppingCarList(mShoppingCar);
        return getDataTable(list);
    }

    /**
     * 导出购物车列表
     */
    @RequiresPermissions("shop:shoppingcar:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MShoppingCar mShoppingCar)
    {
        List<MShoppingCar> list = mShoppingCarService.selectMShoppingCarList(mShoppingCar);
        ExcelUtil<MShoppingCar> util = new ExcelUtil<MShoppingCar>(MShoppingCar.class);
        return util.exportExcel(list, "shoppingcar");
    }

    /**
     * 新增购物车
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存购物车
     */
    @RequiresPermissions("shop:shoppingcar:add")
    @Log(title = "购物车", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MShoppingCar mShoppingCar)
    {
        return toAjax(mShoppingCarService.insertMShoppingCar(mShoppingCar));
    }

    /**
     * 修改购物车
     */
    @GetMapping("/edit/{shoppingCarId}")
    public String edit(@PathVariable("shoppingCarId") Integer shoppingCarId, ModelMap mmap)
    {
        MShoppingCar mShoppingCar = mShoppingCarService.selectMShoppingCarById(shoppingCarId);
        mmap.put("mShoppingCar", mShoppingCar);
        return prefix + "/edit";
    }

    /**
     * 修改保存购物车
     */
    @RequiresPermissions("shop:shoppingcar:edit")
    @Log(title = "购物车", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MShoppingCar mShoppingCar)
    {
        return toAjax(mShoppingCarService.updateMShoppingCar(mShoppingCar));
    }

    /**
     * 删除购物车
     */
    @RequiresPermissions("shop:shoppingcar:remove")
    @Log(title = "购物车", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(mShoppingCarService.deleteMShoppingCarByIds(ids));
    }
}
