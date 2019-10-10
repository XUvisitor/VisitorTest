package com.visitor.shop.controller;

import com.visitor.shop.domain.MProduct;
import com.visitor.shop.service.IMBrandService;
import com.visitor.shop.service.IMProductService;
import com.visitor.shop.service.IMTeamService;
import com.visitor.shop.service.IMUseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Description TODO
 * @Author visitor
 * @Date 2019/9/17 21:54
 * @Version 1.0
 */
@Controller
@RequestMapping("/stage")
public class StageController {

    private String prefix = "stage/";

    @Autowired
    private IMProductService mProductService;


    @Autowired
    private IMBrandService imBrandService;

    @Autowired
    private IMTeamService imTeamService;

    @Autowired
    private IMUseService imUseService;

    @RequestMapping("/shop")
    public String stage(ModelMap modelMap) {
        return prefix + "shop";
    }

    @RequestMapping("/list")
    public String list(ModelMap modelMap) {
        modelMap.addAttribute("product", mProductService.selectMProductList(null));
        modelMap.addAttribute("teamList", imTeamService.selectMTeamList(null));
        modelMap.addAttribute("useList", imUseService.selectMUseList(null));
        modelMap.addAttribute("brandList", imBrandService.selectMBrandList(null));
        return prefix + "list";
    }

    @RequestMapping("/detail")
    public String detail(Integer productId, ModelMap modelMap) {
        modelMap.addAttribute("product", mProductService.selectMProductById(productId));
        return prefix + "detail";
    }
}
