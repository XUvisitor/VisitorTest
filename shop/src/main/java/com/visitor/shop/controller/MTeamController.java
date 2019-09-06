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
import com.visitor.shop.domain.MTeam;
import com.visitor.shop.service.IMTeamService;
import com.visitor.common.core.controller.BaseController;
import com.visitor.common.core.domain.AjaxResult;
import com.visitor.common.utils.poi.ExcelUtil;
import com.visitor.common.core.page.TableDataInfo;

/**
 * 队伍Controller
 * 
 * @author visitor
 * @date 2019-09-06
 */
@Controller
@RequestMapping("/shop/team")
public class MTeamController extends BaseController
{
    private String prefix = "shop/team";

    @Autowired
    private IMTeamService mTeamService;

    @RequiresPermissions("shop:team:view")
    @GetMapping()
    public String team()
    {
        return prefix + "/team";
    }

    /**
     * 查询队伍列表
     */
    @RequiresPermissions("shop:team:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(MTeam mTeam)
    {
        startPage();
        List<MTeam> list = mTeamService.selectMTeamList(mTeam);
        return getDataTable(list);
    }

    /**
     * 导出队伍列表
     */
    @RequiresPermissions("shop:team:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(MTeam mTeam)
    {
        List<MTeam> list = mTeamService.selectMTeamList(mTeam);
        ExcelUtil<MTeam> util = new ExcelUtil<MTeam>(MTeam.class);
        return util.exportExcel(list, "team");
    }

    /**
     * 新增队伍
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存队伍
     */
    @RequiresPermissions("shop:team:add")
    @Log(title = "队伍", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(MTeam mTeam)
    {
        return toAjax(mTeamService.insertMTeam(mTeam));
    }

    /**
     * 修改队伍
     */
    @GetMapping("/edit/{teamId}")
    public String edit(@PathVariable("teamId") Integer teamId, ModelMap mmap)
    {
        MTeam mTeam = mTeamService.selectMTeamById(teamId);
        mmap.put("mTeam", mTeam);
        return prefix + "/edit";
    }

    /**
     * 修改保存队伍
     */
    @RequiresPermissions("shop:team:edit")
    @Log(title = "队伍", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(MTeam mTeam)
    {
        return toAjax(mTeamService.updateMTeam(mTeam));
    }

    /**
     * 删除队伍
     */
    @RequiresPermissions("shop:team:remove")
    @Log(title = "队伍", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(mTeamService.deleteMTeamByIds(ids));
    }
}
