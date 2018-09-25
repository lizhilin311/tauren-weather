package com.tauren.cloud.weather.service;

import com.tauren.cloud.weather.vo.City;

import java.util.List;

/**
 * ClassName:CityDataService
 *
 * @author lizhilin
 * @date 2018/9/16 0016
 * @descr:
 */
public interface CityDataService {
    //获取城市列表
    List<City> listCity() throws Exception;
}
