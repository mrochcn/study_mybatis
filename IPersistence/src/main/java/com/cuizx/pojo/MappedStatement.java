package com.cuizx.pojo;

public class MappedStatement {
    /**
     * 一共要存储mapper中的四个属性分别是ID，resultType，parameterType，sql语句
     */
    //id
    private String id;
    //resultType
    private String resultType;
    //parameter
    private String paramterType;
    //sql
    private String sql;

    public void setId(String id) {
        this.id = id;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    public void setParamterType(String paramterType) {
        this.paramterType = paramterType;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getId() {
        return id;
    }

    public String getResultType() {
        return resultType;
    }

    public String getParamterType() {
        return paramterType;
    }

    public String getSql() {
        return sql;
    }


}
