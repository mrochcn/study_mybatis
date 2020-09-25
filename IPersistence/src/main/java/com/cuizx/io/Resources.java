package com.cuizx.io;

import java.io.InputStream;

public class Resources {
    //根据配置文件路径将配置文件加载成字节数入流存储在内存中
    public static InputStream getResourceAsStream(String path){
       InputStream inputStream=Resources.class.getClassLoader().getResourceAsStream(path);
       return inputStream;
    }
}
