package com.tauren.cloud.weather.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.Reader;
import java.io.StringReader;

/**
 * ClassName:XmlBuilder
 *
 * @author lizhilin
 * @date 2018/9/15 0015
 * @descr:  xml解析工具类
 */
public class XmlBuilder {
    /**
     * 将String文件转换成指定的POJO
     * @param clazz
     * @param xmlStr
     * @return
     * @throws Exception
     */
    public static Object xmlStrToObject(Class<?> clazz,String xmlStr) throws Exception{
        Object xmlObject = null;
        Reader reader = null;
        JAXBContext context = JAXBContext.newInstance(clazz);
        //XML转为对象的接口
        Unmarshaller unmarshaller =  context.createUnmarshaller();
        reader = new StringReader(xmlStr);
        xmlObject = unmarshaller.unmarshal(reader);
        if(null != reader){
            reader.close();
        }
        return xmlObject;
    }
}
