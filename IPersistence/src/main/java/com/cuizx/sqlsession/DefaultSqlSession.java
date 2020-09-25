package com.cuizx.sqlsession;

import java.util.List;

public class DefaultSqlSession implements SqlSession {
    @Override
    public <E> List<E> selectList(String statementId, Object... params) {
        return null;
    }

    @Override
    public <T> T selectOne(String statementId, Object... params) {
        return null;
    }
}
