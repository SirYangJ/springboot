# Springboot 框架
集成mysql、mybatis、cat监控
项目启动测试前，创建test数据库，执行test.sql脚本
注意：因为本项目使用了lombok，所以开发工具需要安装lombok插件，请自行安装插件

#cat部署
#服务端配置
1、把cat.war包放在tomcat中，启动tomcat，注意端口占用，tomcat默认占用了8080。项目jdk必须为1.8，因为cat.war包编译版本为1.8，必须保持一致。
2、访问http://localhost:8080/cat/s/config?op=routerConfigUpdate 配置客户端路由，以下为本地单机配置
<?xml version="1.0" encoding="utf-8"?>
<router-config backup-server="192.168.199.125" backup-server-port="2280">
   <default-server id="192.168.199.125" weight="1.0" port="2280" enable="true"/>
</router-config>
3、配置client.xml和server.xml，参考data文件夹里的配置，配置完成后把data文件夹放在根目录。（/data路径）
4、mysql执行cat数据库初始sql-CatApplication.sql
（如果cat服务启动后，无法看到监控内容，可尝试重启电脑或者服务器后再试）
#客户端配置
1、项目增加cat依赖
    <dependency>
        <groupId>com.dianping.cat</groupId>
        <artifactId>cat-client</artifactId>
        <version>${cat.version}</version>
    </dependency>
2、项目中配置CatFilterConfigure
3、项目增加app.properties,路径必须在META-INF下，文件名也必须相同，app.name配置为项目名，该名称为在cat中监控中显示的项目名。
4、启动springboot，即刻在cat后台中查看监控（如果cat服务启动后，无法看到监控内容，可尝试重启电脑或者服务器后再试）
