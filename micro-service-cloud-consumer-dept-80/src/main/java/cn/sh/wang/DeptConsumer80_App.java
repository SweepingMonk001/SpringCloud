package cn.sh.wang;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import cn.sh.wang.ribbon.MySelfrule;

@SpringBootApplication
@EnableEurekaClient //eurekaClient客户端
@RibbonClient(name="MICRO-SERVICE-CLOUD-DEPT" ,configuration=MySelfrule.class)//Ribbon客户端负载均衡技术
public class DeptConsumer80_App {

    public static void main(String[] args) {
            SpringApplication.run(DeptConsumer80_App.class, args);
    }

}
