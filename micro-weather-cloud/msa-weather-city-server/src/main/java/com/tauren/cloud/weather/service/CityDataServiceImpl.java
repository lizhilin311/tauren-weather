package com.tauren.cloud.weather.service;

import com.tauren.cloud.weather.util.XmlBuilder;
import com.tauren.cloud.weather.vo.City;
import com.tauren.cloud.weather.vo.CityList;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * ClassName:CityDataServiceImpl
 *
 * @author lizhilin
 * @date 2018/9/16 0016
 * @descr:
 */
@Service
public class CityDataServiceImpl implements CityDataService{
    @Override
    public List<City> listCity() throws Exception {
        //读取xml文件
        Resource resource = new ClassPathResource("citylist.xml");
        BufferedReader br = new BufferedReader(new InputStreamReader(((ClassPathResource) resource).getInputStream(),"utf-8"));
        StringBuffer buffer = new StringBuffer();
        String line = "";
        while((line = br.readLine()) != null ){
            buffer.append(line);
        }
        br.close();
        //xml转为java对象
        CityList cityList = (CityList)XmlBuilder.xmlStrToObject(CityList.class,buffer.toString());
        return cityList.getCityList();
    }
}
