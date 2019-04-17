package cn.sh.wnag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class EurekaService7003APP {
            
    public static void main(String[] args) {
        SpringApplication.run(EurekaService7003APP.class, args);
        
    }

}
