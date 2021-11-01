package com.company.springcloud.service;

import com.company.springcloud.model.Goods;

import java.util.List;

/**
 * @author zytwl
 */
public interface GoodsSevice {
    /**
     * 返回商品列表
     * @return List<Goods>商品列表
     * */
    List<Goods> getAllGoods();
}
