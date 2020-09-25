package com.cuizx.sqlsession;

import java.util.List;

public interface SqlSession {
    //查询所有
    //范型
    public <E> List<E> selectList(String statementId,Object... params);

    //根据条件查询单个
    public <T> T selectOne(String statementId,Object... params);


}
