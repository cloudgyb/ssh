# SSH 整合项目示例
#### 这是一个Maven项目

### 开发环境说明：
  - Eclipse
    * 版本 Version: Oxygen.2 Release (4.7.2)
    * Build id: 20171218-0600
  - Maven 
    * 版本 3.5.0
  - Jetty
    * 开发服务器Jetty 版本9.4.8.v20171121
  - MySQL
    * 数据库版本mysql57
    * 驱动 5.1.40
  - Spring
   	* 版本4.3.14.RELEASE
  - Struts 
    * 版本 2.5.14.1
  - Hibernate
    * 版本 5.2.12.Final
  - 项目编码
    * utf-8

### 项目部署：
  + 导入项目到Eclipse
  + 导入database.sql到数据库
  + 使用src/main/java com.gyb.ssh.util DESCUtil.java 加密你的数据库用户名和密码，生成加密字符串
  + 修改src/main/resources/jdbc.properties 的jdbc.username和jdbc.password值
  

### 项目运行：
 + mvn clean
 + mvn jetty:run