package com.company.springcloud.controller;

import com.company.springcloud.constant.Constant;
import com.company.springcloud.model.Goods;
import com.company.springcloud.model.ResultObject;
import com.company.springcloud.service.GoodsSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zytwl
 */
@RestController
public class GoodsController {
    @Autowired
    private GoodsSevice goodsSevice;

    @GetMapping("/service/goods")
    public ResultObject goods(Model model){
        List<Goods> goodsList = goodsSevice.getAllGoods();
        return new ResultObject(Constant.ZERO,"查询成功",goodsList);
    }

}
