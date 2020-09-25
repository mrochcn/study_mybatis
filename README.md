# study_mybatis

### 增加IPeristences_test
首先添加用于测试持久层的客户端。  
（1）sqlMaoConfig.xml : 存放数据库配置信息，存放mapper的全路径（加载配置文件时，不用重复加载）  
（2）mapper.xml:存放sql配置信息  
### 加载配置文件  
根据配置文件路径加载配置文件成字节输入流，存储在内存中  
创建Resources类 方法 getResourceAsStream(String path)  
### 创建两个javabean（容器对象）：存放的是对配置文件解析出来的内容。  
Configuration：核心配置类：存放sqlMapConfig.xml解析出来的内容。  
MappedStatement：映射配置类：存放mapper.xml解析出来的内容。  
### 使用dom4j对XMLConfigBuilder和XMLMapperedBuilder进行解析
具体使用到的方法有
SAXReader().read()对输入的流进行读取然后返回Document对象document  
document.getRootElement()获取跟Element  
rootElement.selectNodes("//property")，对sqlMapConfig.XML 中propery里面的参数进行读取  
element.attributeValue("name")通过这个方法对propery中name的值进行读取  
Properties properties = new Properties();用于存取键值对进行读取  
#### 引用c3p0包，创建mysql连接池  
ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();  
comboPooledDataSource.setDriverClass(properties.getProperty("driverClass"));  
comboPooledDataSource.setJdbcUrl(properties.getProperty(("jdbcUrl")));  
comboPooledDataSource.setUser(properties.getProperty("username"));  
comboPooledDataSource.setPassword(properties.getProperty("password"));  
configuration.setDataSource(comboPooledDataSource);  

