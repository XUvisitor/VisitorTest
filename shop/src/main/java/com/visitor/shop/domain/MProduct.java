package com.visitor.shop.domain;

import com.visitor.common.core.domain.BaseEntity;

/**
 * @Description TODO
 * @Author visitor
 * @Date 2019/9/5 21:38
 * @Version 1.0
 */
public class MProduct extends BaseEntity {

    /**
     * 产品编号
     */
    private Integer productId;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 产品价格
     */
    private String price;
    
    /**
     * 产品描述
     */
    private String describe;
    
    /**
     * 产品图片
     */
    private String image;
    
    /**
     * 产品品牌
     */
    private String brandId;
    
    /**
     * 所属队伍
     */
    private String teamId;

    /**
     * 产品用途
     */
    private String useId;
}
