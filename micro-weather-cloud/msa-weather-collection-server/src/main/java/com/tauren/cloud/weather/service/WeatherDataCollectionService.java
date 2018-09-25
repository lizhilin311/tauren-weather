package com.tauren.cloud.weather.service;

/**
 * ClassName:WeatherDataCollectionService
 *
 * @author lizhilin
 * @date 2018/9/17 0017
 * @descr:
 */
public interface WeatherDataCollectionService {
    /**
     * 根据城市ID同步天气
     * @param cityId
     */
    void syncDataByCityId(String cityId);
}
