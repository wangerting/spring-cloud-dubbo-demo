#!/bin/bash
# 启动 nacos
sh ./nacos-2.0.1/bin/startup.sh -m standalone
# 启动 sentinel dubbo服务管理
nohup java -Dserver.port=7070 -Dcsp.sentinel.dashboard.server=localhost:7070 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard.jar >> ./logs/sentinel.out &
# 启动 zipkin 链路跟踪 数据持久化
nohup java -jar zipkin.jar --STORAGE_TYPE=mysql --MYSQL_HOST=127.0.0.1 --MYSQL_TCP_PORT=3306 --MYSQL_DB=zipkin --MYSQL_USER=root --MYSQL_PASS='Tom579#$%^&' >> ./logs/zipkin.out &
# 启动 seata 分布式事务
nohup sh ./seata-server-1.4.2/bin/seata-server.sh -p 8091 -m db >> ./logs/seata.out &
