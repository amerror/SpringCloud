package com.company.springcloud.service;

import com.company.springcloud.model.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Component
@FeignClient(value="test01-springcloud-service-goods")
public interface GoodsRemoteClient {

    @RequestMapping(value = "/service/goods")
    public List<Goods> getAllGoods();

}
