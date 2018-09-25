package com.tauren.cloud.weather.controller;

import com.tauren.cloud.weather.service.CityClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName:CityController
 *
 * @author lizhilin
 * @date 2018/9/19 0019
 * @descr:
 */
@RestController
public class CityController {
    @Autowired
    private CityClient cityClient;

    @GetMapping("/cities")
    public String listCity(){
        //通过Feign客户端来查找
        String body = cityClient.listCity();
        return body;
    }
}
