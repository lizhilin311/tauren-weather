package com.tauren.cloud.weather.service;

import com.tauren.cloud.weather.vo.City;
import com.tauren.cloud.weather.vo.Weather;
import com.tauren.cloud.weather.vo.WeatherResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * ClassName:WeatherDataClient
 *
 * @author lizhilin
 * @date 2018/9/19 0019
 * @descr:
 */
@FeignClient("msa-weather-data-eureka")
public interface WeatherDataClient {
    @GetMapping("/weather/cityId/{cityId}")
    WeatherResponse getDataByCityId(@PathVariable("cityId") String cityId);
}
