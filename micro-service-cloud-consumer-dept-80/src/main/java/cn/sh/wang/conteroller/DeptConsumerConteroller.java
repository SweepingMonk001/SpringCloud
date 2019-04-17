package cn.sh.wang.conteroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



import cn.sh.wang.springcloud.pojo.Dept;

import com.netflix.infix.lang.infix.antlr.EventFilterParser.boolean_expr_return;


/**
 * 服务消费端
 * @author Administrator
 *
 */

@RestController
public class DeptConsumerConteroller {
    
   //路径  MICRO-SERVICE-CLOUD-DEPT-8001
//    private static final String REST_URL_PREFIX="http://127.0.0.1:8001";
    private static final String REST_URL_PREFIX="http://MICRO-SERVICE-CLOUD-DEPT";
 
    //rest模板调用工具
    @Autowired
    private RestTemplate restTemplate;
    
    @RequestMapping("/consumer/dept/add")
     public boolean add(Dept dept){
         
         return this.restTemplate.postForObject(REST_URL_PREFIX+"/dept/add", dept, boolean.class);
     }
    
    
    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
            return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list()
    {
            return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }
    
    

    // 测试@EnableDiscoveryClient,消费端可以调用服务发现
    @RequestMapping(value = "/consumer/dept/discovery")
    public Object discovery()
    {
            return restTemplate.getForObject(REST_URL_PREFIX + "/dept/discovery", Object.class);
    }
    
}
