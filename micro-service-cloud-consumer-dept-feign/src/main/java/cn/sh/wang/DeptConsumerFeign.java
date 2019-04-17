package cn.sh.wang;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient //eurekaClient客户端
@EnableFeignClients(basePackages="cn.sh.wang")
@ComponentScan("cn.sh.wang")
public class DeptConsumerFeign {

    public static void main(String[] args) {
            SpringApplication.run(DeptConsumerFeign.class, args);
    }

}
