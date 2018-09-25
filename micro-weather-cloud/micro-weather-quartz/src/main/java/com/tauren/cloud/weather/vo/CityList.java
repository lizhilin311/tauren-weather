package com.tauren.cloud.weather.vo;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * ClassName:CityList
 *
 * @author lizhilin
 * @date 2018/9/15 0015
 * @descr:
 */
@XmlRootElement(name = "c")
@XmlAccessorType(XmlAccessType.FIELD)
public class CityList {
    @XmlElement(name = "d")
    private List<City> cityList;

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }
}
