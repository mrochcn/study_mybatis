package com.cuizx.test;

import com.cuizx.io.Resources;

import java.io.InputStream;

public class IPersistenceTest {
    public void test(){
        InputStream inputStream=Resources.getResourceAsStream("sqlMapConfig.xml");
    }
}
