package com.tauren.cloud.weather.service;

import java.util.ArrayList;
import java.util.List;

import com.tauren.cloud.weather.vo.Forecast;
import com.tauren.cloud.weather.vo.Weather;
import com.tauren.cloud.weather.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Weather Report Service.
 * 
 * @since 1.0.0 2017年11月26日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
@Service
public class WeatherReportServiceImpl implements WeatherReportService {
	@Autowired
	private DataClient dataClient;
	
	@Override
	public Weather getDataByCityId(String cityId) {
		//  改为由天气数据API微服务来提供
		WeatherResponse  resp = dataClient.getDataByCityId(cityId);
		Weather data = resp.getData();
		return data;
	}

}
