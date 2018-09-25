package com.tauren.cloud.weather.vo;

import java.io.Serializable;

/**
 * Weather Response.
 * 
 * @since 1.0.0 2017年11月21日
 * @author <a href="https://waylau.com">Way Lau</a> 
 */
public class WeatherResponse implements Serializable {

	private static final long serialVersionUID = 1L;
	//天气数据
	private Weather data;
	//返回状态
	private Integer status;
	private String desc;
	public Weather getData() {
		return data;
	}
	public void setData(Weather data) {
		this.data = data;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
