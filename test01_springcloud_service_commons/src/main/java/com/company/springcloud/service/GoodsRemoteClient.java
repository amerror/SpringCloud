package com.company.springcloud.service;

import com.company.springcloud.constant.Constant;
import com.company.springcloud.model.Goods;
import com.company.springcloud.model.ResultObject;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Component
@FeignClient(value="SERVICEGOODS")
public interface GoodsRemoteClient {

    @GetMapping("/service/goods")
    public ResultObject goods();

}
