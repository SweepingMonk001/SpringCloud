package cn.sh.wang.ribbon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 * random自定义负载均衡算法
 * @author Administrator
 *
 */
@Configuration
public class MySelfrule {
    
    
    
    @Bean//客户端自定义随机算法
    public IRule myEule(){
        
//        return new RandomRule();//随机算法
        return new RandomRule_ZY();// 我自定义为每台机器5次
    }

}
