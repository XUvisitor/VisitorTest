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
import com.visitor.shop.domain.MOrderList;
import com.visitor.shop.service.IMOrderListService;
import com.visitor.common.core.controller.BaseController;
import com.visitor.common.core.domain.AjaxResult;
import com.visitor.common.utils.poi.ExcelUtil;
import com.visitor.common.core.page.TableDataInfo;

/**
 * 订单Controller
 * 
 * @author visitor
 * @date 2019-09-15
 */
@Controller
@RequestMapping("/shop/list")
public class MOrderListController extends BaseController
{
    private String prefix = "shop/list";

    @Autowired
    private IMOrderListService mOrderListService;

    @RequiresPermissions("shop:list:view")
    @GetMapping()
    public String list()
    {
        return prefix + "/list";
    }

    /**
     * 查询订单列表
     */
    @RequiresPermissions("shop:list:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MOrderList mOrderList)
    {
        startPage();
        List<MOrderList> list = mOrderListService.selectMOrderListList(mOrderList);
        return getDataTable(list);
    }

    /**
     * 导出订单列表
     */
    @RequiresPermissions("shop:list:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MOrderList mOrderList)
    {
        List<MOrderList> list = mOrderListService.selectMOrderListList(mOrderList);
        ExcelUtil<MOrderList> util = new ExcelUtil<MOrderList>(MOrderList.class);
        return util.exportExcel(list, "list");
    }

    /**
     * 新增订单
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存订单
     */
    @RequiresPermissions("shop:list:add")
    @Log(title = "订单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MOrderList mOrderList)
    {
        return toAjax(mOrderListService.insertMOrderList(mOrderList));
    }

    /**
     * 修改订单
     */
    @GetMapping("/edit/{orderListId}")
    public String edit(@PathVariable("orderListId") String orderListId, ModelMap mmap)
    {
        MOrderList mOrderList = mOrderListService.selectMOrderListById(orderListId);
        mmap.put("mOrderList", mOrderList);
        return prefix + "/edit";
    }

    /**
     * 修改保存订单
     */
    @RequiresPermissions("shop:list:edit")
    @Log(title = "订单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MOrderList mOrderList)
    {
        return toAjax(mOrderListService.updateMOrderList(mOrderList));
    }

    /**
     * 删除订单
     */
    @RequiresPermissions("shop:list:remove")
    @Log(title = "订单", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(mOrderListService.deleteMOrderListByIds(ids));
    }
}
