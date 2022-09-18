package com.example.rocketmqbroadcastproducer;

import com.skysoft.mms.dubbo.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/site")
public class SiteContorller {
    //订阅服务
    //生成代理对象  ,url = "dubbo://192.168.134.1:20882/com.skysoft.mms.dubbo.HelloService"
    @DubboReference(check = false,  //启动时检查提供者是否存在，true报错，false忽略
            timeout = 3000,retries = 3,interfaceClass = HelloService.class, //服务接口名
            version = "2.0.0")
    private HelloService helloService;
 
    @GetMapping("/helo")
    public String sayHello(String name){
        return helloService.sayHello(name);
    }
 
}