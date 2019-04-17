package cn.sh.wang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient//服务注册
@EnableDiscoveryClient//服务发现
public class provider_dept_8003_App {

    public static void main(String[] args) {
            SpringApplication.run(provider_dept_8003_App.class, args);
    }

}
