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
import com.visitor.shop.domain.MUse;
import com.visitor.shop.service.IMUseService;
import com.visitor.common.core.controller.BaseController;
import com.visitor.common.core.domain.AjaxResult;
import com.visitor.common.utils.poi.ExcelUtil;
import com.visitor.common.core.page.TableDataInfo;

/**
 * 用途Controller
 * 
 * @author visitor
 * @date 2019-09-06
 */
@Controller
@RequestMapping("/shop/use")
public class MUseController extends BaseController
{
    private String prefix = "shop/use";

    @Autowired
    private IMUseService mUseService;

    @RequiresPermissions("shop:use:view")
    @GetMapping()
    public String use()
    {
        return prefix + "/use";
    }

    /**
     * 查询用途列表
     */
    @RequiresPermissions("shop:use:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MUse mUse)
    {
        startPage();
        List<MUse> list = mUseService.selectMUseList(mUse);
        return getDataTable(list);
    }

    /**
     * 导出用途列表
     */
    @RequiresPermissions("shop:use:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MUse mUse)
    {
        List<MUse> list = mUseService.selectMUseList(mUse);
        ExcelUtil<MUse> util = new ExcelUtil<MUse>(MUse.class);
        return util.exportExcel(list, "use");
    }

    /**
     * 新增用途
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存用途
     */
    @RequiresPermissions("shop:use:add")
    @Log(title = "用途", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MUse mUse)
    {
        return toAjax(mUseService.insertMUse(mUse));
    }

    /**
     * 修改用途
     */
    @GetMapping("/edit/{useId}")
    public String edit(@PathVariable("useId") Integer useId, ModelMap mmap)
    {
        MUse mUse = mUseService.selectMUseById(useId);
        mmap.put("mUse", mUse);
        return prefix + "/edit";
    }

    /**
     * 修改保存用途
     */
    @RequiresPermissions("shop:use:edit")
    @Log(title = "用途", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MUse mUse)
    {
        return toAjax(mUseService.updateMUse(mUse));
    }

    /**
     * 删除用途
     */
    @RequiresPermissions("shop:use:remove")
    @Log(title = "用途", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(mUseService.deleteMUseByIds(ids));
    }
}
