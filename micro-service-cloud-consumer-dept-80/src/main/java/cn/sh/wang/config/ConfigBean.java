package cn.sh.wang.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;

/**
 * 配置类
 * @author Administrator
 *
 */
@Configuration
public class ConfigBean {
    
    
    /**
     * 类似于xml中的<bean> 
     * @return
     */
    @Bean
    @LoadBalanced //ribbon客户端的负载均衡
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
        
        
    }
    
    
    @Bean//客户端自定义随机算法
    public IRule myEule(){
        
        return new RandomRule();
    }

}
