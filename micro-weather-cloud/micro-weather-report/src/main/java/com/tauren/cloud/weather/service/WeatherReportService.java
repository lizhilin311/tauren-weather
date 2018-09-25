package com.tauren.cloud.weather.service;

import com.tauren.cloud.weather.vo.Weather;

/**
 * ClassName:WeatherReportService
 *
 * @author lizhilin
 * @date 2018/9/16 0016
 * @descr:
 */
public interface WeatherReportService {
    /**
     * 根据城市ID查询天气信息
     * @param cityId
     * @return
     */
    Weather getDataByCityId(String cityId);
}
