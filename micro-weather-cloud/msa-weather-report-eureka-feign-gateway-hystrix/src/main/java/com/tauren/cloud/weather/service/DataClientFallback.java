package com.tauren.cloud.weather.service;

import com.tauren.cloud.weather.vo.City;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName:DataClientFallback
 *
 * @author lizhilin
 * @date 2018/9/22 0022
 * @descr:
 */
@Component
public class DataClientFallback implements DataClient{
    @Override
    public List<City> cityList() throws Exception {
        List<City> cityList = null;
        cityList = new ArrayList<>();
        City city = new City();
        city.setCityId("101280601");
        city.setCityName("深圳");
        cityList.add(city);

        city = new City();
        city.setCityId("101280301");
        city.setCityName("惠州");
        cityList.add(city);
        return cityList;
    }

    @Override
    public WeatherReportService getDataByCityId(String cityId) {
        return null;
    }
}
