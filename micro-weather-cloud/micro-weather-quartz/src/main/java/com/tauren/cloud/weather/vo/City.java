package com.tauren.cloud.weather.vo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * $CLASS_NAME$
 * descr:
 *
 * @author lizhilin
 * @date $CREAT_DATE$
 */
//下面注解可以获取xml中的城市信息
@XmlRootElement(name = "d")
@XmlAccessorType(XmlAccessType.FIELD)
public class City {
    //城市ID
    @XmlAttribute(name = "d1")
    private String cityId;
    //城市名
    @XmlAttribute(name = "d2")
    private String cityName;
    //城市编码
    @XmlAttribute(name = "d3")
    private String cityCode;
    //省
    @XmlAttribute(name = "d4")
    private String provence;

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getProvence() {
        return provence;
    }

    public void setProvence(String provence) {
        this.provence = provence;
    }
}
