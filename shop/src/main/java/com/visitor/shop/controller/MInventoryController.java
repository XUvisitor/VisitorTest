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
import com.visitor.shop.domain.MInventory;
import com.visitor.shop.service.IMInventoryService;
import com.visitor.common.core.controller.BaseController;
import com.visitor.common.core.domain.AjaxResult;
import com.visitor.common.utils.poi.ExcelUtil;
import com.visitor.common.core.page.TableDataInfo;

/**
 * 库存Controller
 * 
 * @author visitor
 * @date 2019-09-15
 */
@Controller
@RequestMapping("/shop/inventory")
public class MInventoryController extends BaseController
{
    private String prefix = "shop/inventory";

    @Autowired
    private IMInventoryService mInventoryService;

    @RequiresPermissions("shop:inventory:view")
    @GetMapping()
    public String inventory()
    {
        return prefix + "/inventory";
    }

    /**
     * 查询库存列表
     */
    @RequiresPermissions("shop:inventory:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MInventory mInventory)
    {
        startPage();
        List<MInventory> list = mInventoryService.selectMInventoryList(mInventory);
        return getDataTable(list);
    }

    /**
     * 导出库存列表
     */
    @RequiresPermissions("shop:inventory:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MInventory mInventory)
    {
        List<MInventory> list = mInventoryService.selectMInventoryList(mInventory);
        ExcelUtil<MInventory> util = new ExcelUtil<MInventory>(MInventory.class);
        return util.exportExcel(list, "inventory");
    }

    /**
     * 新增库存
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存库存
     */
    @RequiresPermissions("shop:inventory:add")
    @Log(title = "库存", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MInventory mInventory)
    {
        return toAjax(mInventoryService.insertMInventory(mInventory));
    }

    /**
     * 修改库存
     */
    @GetMapping("/edit/{inventoryId}")
    public String edit(@PathVariable("inventoryId") Integer inventoryId, ModelMap mmap)
    {
        MInventory mInventory = mInventoryService.selectMInventoryById(inventoryId);
        mmap.put("mInventory", mInventory);
        return prefix + "/edit";
    }

    /**
     * 修改保存库存
     */
    @RequiresPermissions("shop:inventory:edit")
    @Log(title = "库存", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MInventory mInventory)
    {
        return toAjax(mInventoryService.updateMInventory(mInventory));
    }

    /**
     * 删除库存
     */
    @RequiresPermissions("shop:inventory:remove")
    @Log(title = "库存", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(mInventoryService.deleteMInventoryByIds(ids));
    }
}
