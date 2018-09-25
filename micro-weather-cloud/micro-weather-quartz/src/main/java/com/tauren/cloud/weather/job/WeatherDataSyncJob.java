package com.tauren.cloud.weather.job;

import com.tauren.cloud.weather.service.CityDataService;
import com.tauren.cloud.weather.service.WeatherDataService;
import com.tauren.cloud.weather.vo.City;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;

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
    private CityDataService cityDataService;

    @Autowired
    private WeatherDataService weatherDataService;

    private static final Logger logger = LoggerFactory.getLogger(WeatherDataSyncJob.class);
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("Weather Data Sync Job Start");
        //获取城市ID
        List<City> cityList = null;
        try {
            cityList = cityDataService.listCity();
        } catch (Exception e) {
            logger.error("Exception",e);
        }
        //遍历城市ID获取天气
        for(City city: cityList ){
            String cityId = city.getCityId();
            logger.info("Weather Data Sync Job，cityId：" +cityId);
            weatherDataService.syncDataByCityId(cityId);
        }
        logger.info("Weather Data Sync Job End");
    }
}
