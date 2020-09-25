package com.cuizx.config;

import com.cuizx.pojo.Configuration;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


import java.beans.PropertyVetoException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

public class XMLConfigureBuilder {

    private Configuration configuration= new Configuration();

    public XMLConfigureBuilder() {
    }

    public Configuration parseConfigure(InputStream inputStream) throws DocumentException, PropertyVetoException {
        Document document = new SAXReader().read(inputStream);
        //configuration
        Element rootElement=document.getRootElement();
        List<Element> list = rootElement.selectNodes("//property");
        //容器来存储值
        Properties properties = new Properties();
        for(Element element:list){
            String name = element.attributeValue("name");
            String value = element.attributeValue("value");
            properties.setProperty(name,value);
        }
        //连接池把JDBC存在的频繁创建数据库链接解决掉
        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        comboPooledDataSource.setDriverClass(properties.getProperty("driverClass"));
        comboPooledDataSource.setJdbcUrl(properties.getProperty(("jdbcUrl")));
        comboPooledDataSource.setUser(properties.getProperty("username"));
        comboPooledDataSource.setPassword(properties.getProperty("password"));
        configuration.setDataSource(comboPooledDataSource);


        //mapper.xml解析;从sqlMapConfig中拿到路径
        List<Element> mapperList = rootElement.selectNodes("//mapper");
        for (Element element : mapperList) {

        }



        return configuration;
    }
}
