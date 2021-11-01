package com.company.springcloud.controller;

import com.company.springcloud.model.Goods;
import com.company.springcloud.model.ResultObject;
import com.company.springcloud.service.GoodsRemoteClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author zytwl
 */
@RestController
public class GoodsController {

    private GoodsRemoteClient goodsRemoteClient;

    private static final String GOODS_SERVICE_URL = "http://SERVICEGOODS/service/goods";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/cloud/goods1")
    public @ResponseBody
    ResultObject goods1(){
        ResponseEntity<ResultObject> responseEntity = restTemplate.getForEntity(GOODS_SERVICE_URL,ResultObject.class);
        return responseEntity.getBody();
    }

    @RequestMapping("/service/goods")
    public List<Goods> getAllGoods(){
        return goodsRemoteClient.getAllGoods();
    }


}
