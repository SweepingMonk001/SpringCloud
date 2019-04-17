package cn.sh.wnag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class EurekaService7001APP {
            
    public static void main(String[] args) {
        SpringApplication.run(EurekaService7001APP.class, args);
        
    }

}
