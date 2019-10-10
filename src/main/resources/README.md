使用须知
1、dubbo必须依赖zookeeper,因此，使用前需要先安装和配置zookeeper服务。
   具体方法： 从zookeeper官网（https://mirrors.tuna.tsinghua.edu.cn/apache/zookeeper/zookeeper-3.5.5/apache-zookeeper-3.5.5-bin.tar.gz）
   下载最新的稳定版本。本测试环境为windows,因此，只需要将其解压到d盘目录，然后将zoo_sample.cfg
   文件重命名为zoo.cfg，修改它的数据目录为：dataDir=D:\\data\\zookeeper即可。同时，
   在命令行界面启动bin目录下的zkServ.cmd和zkCli.cmd,命令为zkServer.cmd 和 zkCli.cmd  -server 127.0.0.1:2181
   
2、新建maven项目，暴露远程接口类。接口添加完后，执行mvn compiler install命令，将jar到本地仓库

3、新建dubbo-server 和 dubbo-client项目，分别引入dubbo-spring-boot-starter 和接口类对应的jar(在maven项目的pom.xml即可以看到。如本例中为
 <groupId>com.person.demo</groupId><artifactId>dubbo-hello</artifactId><version>1.0-SNAPSHOT</version>).
 
4、 如果方法中涉及对象传参，也可以在接口类中添加相应的类，并实现 Serializable 接口即可。在client端和server可以很方便的引用
 
5、需要在springboot的启动类中添加@EnableDubbo注解，在使用dubbo远程调用的类中添加@Companent 和 @Service （注意不是spring的service注解，而是dubbo的import com.alibaba.dubbo.config.annotation.Service注解）