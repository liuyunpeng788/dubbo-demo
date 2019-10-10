package com.person.dubbo.server;

import com.alibaba.dubbo.config.annotation.Reference;
import com.person.dubbo.server.service.HelloWorld;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServerApplicationTests {

    @Reference
    private HelloWorld helloWorldService;

    @Test
    public void contextLoads() {
        String sayHello = helloWorldService.sayHello("梦超");
        System.out.println(sayHello);
        String sms = helloWorldService.sendSms("13916692729","你好梦超","andriod");
        System.out.println(sms);
    }

}
