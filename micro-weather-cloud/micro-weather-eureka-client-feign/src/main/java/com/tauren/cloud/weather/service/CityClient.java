package com.tauren.cloud.weather.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ClassName:CityClient
 *
 * @author lizhilin
 * @date 2018/9/19 0019
 * @descr:
 */
@FeignClient("msa-weather-city-eureka")
public interface CityClient {
    @GetMapping("/cities")
    String listCity();
}
