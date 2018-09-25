package com.tauren.cloud.weather.controller;

import com.tauren.cloud.weather.service.CityDataService;
import com.tauren.cloud.weather.service.WeatherDataService;
import com.tauren.cloud.weather.service.WeatherReportService;
import com.tauren.cloud.weather.vo.WeatherResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * ClassName:WeatherReportController
 *
 * @author lizhilin
 * @date 2018/9/16 0016
 * @descr:
 */
@RestController
@RequestMapping("/report")
public class WeatherReportController {
    @Autowired
    private CityDataService cityDataService;

    @Autowired
    private WeatherReportService weatherReportService;

    @GetMapping("/cityId/{cityId}")
    public ModelAndView getReportByCityId(@PathVariable("cityId") String cityId, Model model) throws Exception{
        model.addAttribute("title","志林的天气预报");
        model.addAttribute("cityId",cityId);
        model.addAttribute("cityList",cityDataService.listCity());
        model.addAttribute("report",weatherReportService.getDataByCityId(cityId));
        return new ModelAndView("weather/report","reportModel",model);
    }
}
