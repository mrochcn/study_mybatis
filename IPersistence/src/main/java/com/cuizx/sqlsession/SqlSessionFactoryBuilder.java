package com.cuizx.sqlsession;

import com.cuizx.config.XMLConfigureBuilder;
import com.cuizx.pojo.Configuration;
import org.dom4j.DocumentException;

import java.beans.PropertyVetoException;
import java.io.InputStream;

public class SqlSessionFactoryBuilder {
    public SqlSessionFactory build(InputStream in) throws PropertyVetoException, DocumentException {
        //第一：使用dom4j解析配置文件，将解析出来的内容封装到Configuration中
        Configuration configuration=new XMLConfigureBuilder().parseConfigure(in);


        //创建sqlSessionFactory对象

        return null;
    }
}
