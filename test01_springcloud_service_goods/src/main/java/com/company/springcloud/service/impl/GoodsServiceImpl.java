package com.company.springcloud.service.impl;

import com.company.springcloud.model.Goods;
import com.company.springcloud.service.GoodsSevice;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsSevice {
    @Override
    public List<Goods> getAllGoods() {
        Goods g1 = new Goods("电脑","只有1台了",1001);
        Goods g2 = new Goods("笔记本","只有2台了",1002);
        List<Goods> list = new ArrayList<Goods>();
        list.add(g1);
        list.add(g2);
        return list;
    }
}
