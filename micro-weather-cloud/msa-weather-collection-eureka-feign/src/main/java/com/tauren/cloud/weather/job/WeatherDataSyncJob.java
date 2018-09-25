package com.tauren.cloud.weather.job;

import com.tauren.cloud.weather.service.CityClient;
import com.tauren.cloud.weather.service.WeatherDataCollectionService;
import com.tauren.cloud.weather.vo.City;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.ArrayList;
import java.util.List;

/**
 * $CLASS_NAME$
 * descr:
 *
 * @author lizhilin
 * @date $CREAT_DATE$
 */
public class WeatherDataSyncJob  extends QuartzJobBean {
    @Autowired
    private WeatherDataCollectionService weatherDataCollectionService;

    @Autowired
    private CityClient cityClient;

    private static final Logger logger = LoggerFactory.getLogger(WeatherDataSyncJob.class);
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("Weather Data Sync Job Start");
        //获取城市ID列表
        List<City> cityList = null;
        try {
            // 改为由城市API微服务提供数据
            cityList = cityClient.cityList();
        } catch (Exception e) {
            logger.error("Exception",e);
        }
        //遍历城市ID获取天气
        for(City city: cityList ){
            String cityId = city.getCityId();
            logger.info("Weather Data Sync Job，cityId：" +cityId);
            weatherDataCollectionService.syncDataByCityId(cityId);
        }
        logger.info("Weather Data Sync Job End");
    }
}
