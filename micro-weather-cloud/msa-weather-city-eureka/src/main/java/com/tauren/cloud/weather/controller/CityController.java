package com.tauren.cloud.weather.controller;

import com.tauren.cloud.weather.service.CityDataService;
import com.tauren.cloud.weather.vo.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * ClassName:CityController
 *
 * @author lizhilin
 * @date 2018/9/17 0017
 * @descr:
 */
@RestController
@RequestMapping("/cities")
public class CityController {
    @Autowired
    private CityDataService cityDataService;

    @GetMapping
    public List<City> listCity() throws Exception {

        return  cityDataService.listCity();
    }
}
