# SPRING CLOUDS NETFLIX

## 一、main分支初始化SpringClouds基础工程环境

## 二、study分支集成常用SpringCLouds组件

## 三、项目学习模块
### common-core               公共模块
### eureka-server-001         服务注册中心(后续可以做eureka集群高可用)
### order-api                 订单接口模块
### order-feign               订单服务抽象模块
### order-server              订单服务模块
### user-api                  用户接口模块
### user-feign                用户服务抽象模块
### user-server               用户服务模块


## 四、项目模块资源分配
### 1、端口
* order-api:8061
* order-server:8062
* user-api:8071
* user-server:8072
* eureka-server-001:8081


## 五、常用组件
### 一、Eureka
* [Eureka服务端](https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#spring-cloud-eureka-server)
* [Eureka客户端](https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#service-discovery-eureka-clients)

### 二、Ribbon
####1、Ribbon基于eureka的使用