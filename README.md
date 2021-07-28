# spring-cloud-dubbo-demo
spring-cloud-dubbo-demo 是一个 微服务 学习并搭建好的分布式项目；里面包含了
   springcloud+dubbo+nacos+sentinel+Sleuth+ZipKin+seata+mybatis-plus 的整合
dubbo-2.7.8，sentinel-1.8.2，Zinkin-2.22.1，seata-1.4.2，mybatis-plus-3.4.2
docs 项目说明
   db 数据库脚本
   seata 安装配置文件
   shell 插件启动脚本汇总(nacos,sentinel,Zinkin,seata)

nacos{
   版本：2.0.1；下载地址：https://github.com//alibaba/nacos/releases/download/2.0.1/nacos-server-2.0.1.tar.gz
   注册和配置中心
   启动命令：sh startup.sh -m standalone
   账户密码
      nacos
      nacos
}
sentinel{
   版本：1.8.2；下载地址：https://github.com//alibaba/Sentinel/releases/download/1.8.2/sentinel-dashboard-1.8.2.jar
   服务管理工具（服务治理，容错，流控）
   启动命令：java -Dserver.port=7070 -Dcsp.sentinel.dashboard.server=localhost:7070 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard.jar
   启动命令(后台启动)：nohup java -Dserver.port=7070 -Dcsp.sentinel.dashboard.server=localhost:7070 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard.jar &
   账户密码
      sentinel
      sentinel
}
seata{
    版本：1.4.2；下载地址：https://github.com/seata/seata/releases/download/v1.4.2/seata-server-1.4.2.tar.gz
    分布式事务
    安装步骤
        #/script/config-center/config.txt 根据自己的配置中心调整
        # /script/config-center/nacos/nacos-config.sh 将seata的配置放到 nacos配置中心上（nacos-config.sh这个文件最好从github上下载完整文件，否则会有编码格式错误的问题）
        sh nacos-config.sh -h 127.0.0.1 -p 8848 -g SEATA_GROUP -t seate-dev -u nacos -w nacos
    启动命令：：nohup seata-server.sh -p 8091 -m file >> ./logs/seata.out &

    启动命令：：nohup sh ./seata-server-1.4.2/bin/seata-server.sh -p 8091 -m file >> ./logs/seata.out &

	Seata的分布式事务解决方案是业务层面的解决方案，只依赖于单台数据库的事务能力。Seata框架中一个分布式事务包含3中角色：
	    Transaction Coordinator (TC)： 事务协调器，维护全局事务的运行状态，负责协调并驱动全局事务的提交或回滚。
	    Transaction Manager (TM)： 控制全局事务的边界，负责开启一个全局事务，并最终发起全局提交或全局回滚的决议。
	    Resource Manager (RM)： 控制分支事务，负责分支注册、状态汇报，并接收事务协调器的指令，驱动分支（本地）事务的提交和回滚。
	
    pom.xml{
    	<!--  分布式事务 -->
        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alibaba-seata</artifactId>
            <exclusions>
                <exclusion>
                    <groupId>io.seata</groupId>
                    <artifactId>seata-spring-boot-starter</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
        <dependency>
            <groupId>io.seata</groupId>
            <artifactId>seata-spring-boot-starter</artifactId>
            <exclusions>
                <exclusion>
                    <groupId>com.alibaba</groupId>
                    <artifactId>druid</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
    }
    application.yaml{
    	### 分布式事务服务Seata
		seata:
		  #开启seata支持
		  enabled: true
		  #这里需要和config.txt 文件中的service.vgroupMapping.my_test_tx_group=default一致
		  tx-service-group: seata_dubbo_service
		  enable-auto-data-source-proxy: true
		  registry:
		    type: nacos
		    nacos:
		      server-addr: 127.0.0.1:8848
		      namespace: seate-dev
		      group: SEATA_GROUP
		      username: nacos
		      password: nacos
		  config:
		    type: nacos
		    nacos:
		      server-addr: 127.0.0.1:8848
		      namespace: seate-dev
		      group: SEATA_GROUP
		      username: nacos
		      password: nacos
		  service:
		    vgroup-mapping:
		      seata_dubbo_service: default
    }
}

Zinkin{ Zipkin — 微服务链路跟踪.
   分布式实时数据追踪系统
   下载路径：curl -sSL https://zipkin.io/quickstart.sh | bash -s
   启动命令：java -jar zipkin.jar   
   启动命令(后台启动)：nohup java -jar zipkin.jar &
   docker启动命令：docker run -d -p 9411:9411 openzipkin/zipkin
   成功启动后通过访问 http://localhost:9411
}
