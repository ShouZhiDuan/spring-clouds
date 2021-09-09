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
### ribbon-server             Ribbon服务端(URL直连测试调用)
### ribbon-client             Ribbon客户端(URL直连测试调用)


## 四、项目模块资源分配
### 1、订单模块
* order-api:8061
* order-server:8062
### 2、用户模块
* user-api:8071
* user-server:8072
### 3、注册中心模块
* eureka-server-001:8081
### 4、Ribbon模块
* ribbon-server:8091
* ribbon-client:8092
### 5、Openfeign模块
* openfeign-client:8190


## 五、常用组件
### 一、Eureka
* [Eureka服务端](https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#spring-cloud-eureka-server)
* [Eureka客户端](https://docs.spring.io/spring-cloud-netflix/docs/current/reference/html/#service-discovery-eureka-clients)

### 二、Ribbon
#### 1、Ribbon基于eureka的使用
* com.clouds.dsz.controller.RibbonDemoController
* com.clouds.dsz.OrderServerApplication.restTemplate
* com.clouds.dsz.RibbonTest.contextLoads

#### 2、Ribbon不基于eureka的使用
* com.ribbon.dsz.RibbonClientApplication.restTemplate
* com.ribbon.dsz.controller.RibbonClientController
* com.ribbon.dsz.controller.RibbonServerController.test

### 三、OpenFeign
#### 1、实现本地listOfServers配置负载均衡调用以及制定url直连调用
* openfeogn-client工程->classpath:resources/application.properties
* com.openfeign.dsz.rpc.RibbonTestService

### 四、Hystrix 2020版本已经不支持了
#### 1、熔断，降级
* 10秒内20次请求，失败率为50%，进入服务熔断，熔断时间为5秒。
* 熔断->降级
* 超时->降级
* CPU 内存 线程资源隔离
#### 2、使用案例
* Hystrix作用在具体方法上
com.clouds.dsz.controller.HystrixCommandController
* Hystrix作用在feign上
com.clouds.dsz.controller.HystrixFeignController




















