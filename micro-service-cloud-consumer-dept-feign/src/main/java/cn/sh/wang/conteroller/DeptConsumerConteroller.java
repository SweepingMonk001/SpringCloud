package cn.sh.wang.conteroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cn.sh.wang.springcloud.pojo.Dept;
import cn.sh.wang.springcloud.service.DeptClientService;

import com.netflix.infix.lang.infix.antlr.EventFilterParser.boolean_expr_return;


/**
 * feign服务消费端
 * @author Administrator
 *
 */

@RestController
public class DeptConsumerConteroller {
 
//    使用fieign注册的服务直接调用该服务接口
    @Autowired
    private DeptClientService deptClientService;
    
    @RequestMapping("/consumer/dept/add")
     public boolean add(Dept dept){
         
         return this.deptClientService.add(dept);
     }
    
    
    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
            return this.deptClientService.get(id);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list()
    {
            return this.deptClientService.list();
    }
    
 
}
