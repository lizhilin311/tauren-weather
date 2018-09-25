package com.tauren.cloud.weather.service;

import com.tauren.cloud.weather.vo.Weather;
import com.tauren.cloud.weather.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName:WeatherReportServiceImpl
 *
 * @author lizhilin
 * @date 2018/9/16 0016
 * @descr:
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {
    @Autowired
    private WeatherDataService weatherDataService;

    @Override
    public Weather getDataByCityId(String cityId) {
       WeatherResponse resp =  weatherDataService.getDataByCityId(cityId);

        return resp.getData();
    }
}
