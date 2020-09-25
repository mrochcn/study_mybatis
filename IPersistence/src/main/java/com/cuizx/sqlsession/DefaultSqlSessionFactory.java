package com.cuizx.sqlsession;

import com.cuizx.pojo.Configuration;

public class DefaultSqlSessionFactory implements SqlSessionFactory{
    private Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession();
    }
}
