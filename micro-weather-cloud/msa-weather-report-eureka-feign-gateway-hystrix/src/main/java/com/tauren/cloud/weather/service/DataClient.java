package com.tauren.cloud.weather.service;

import com.tauren.cloud.weather.vo.City;
import com.tauren.cloud.weather.vo.WeatherResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * ClassName:DataClient
 *
 * @author lizhilin
 * @date 2018/9/19 0019
 * @descr:
 */
@FeignClient(name = "msa-weather-eureka-client-zuul",fallback = DataClientFallback.class)
public interface DataClient {
    /**
     * 获取城市列表
     * @return
     * @throws Exception
     */
    @GetMapping("/city/cities")
    List<City> cityList() throws Exception;

    /**
     * 根据城市ID查询天气数据
     */
    @GetMapping("/data/weathers/cityId/{cityId}")
    WeatherResponse getDataByCityId(@PathVariable("cityId") String cityId);
}
