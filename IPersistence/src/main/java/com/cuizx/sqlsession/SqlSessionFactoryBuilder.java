package com.cuizx.sqlsession;

import com.cuizx.config.XMLConfigureBuilder;
import com.cuizx.pojo.Configuration;
import org.dom4j.DocumentException;

import java.beans.PropertyVetoException;
import java.io.InputStream;

public class SqlSessionFactoryBuilder {
    public SqlSessionFactory build(InputStream in) throws PropertyVetoException, DocumentException {
        Configuration configuration=new XMLConfigureBuilder().parseConfigure(in);

        return null;
    }
}
