package com.person.dubbo.server;

import com.alibaba.dubbo.config.annotation.Service;
import com.person.dubbo.server.service.HelloWorld;
import com.person.dubbo.server.vo.UserVo;
import org.springframework.stereotype.Component;

/**
 * @author liumch
 * create :  2019/10/9 19:46
 **/

@Service
@Component
public class HelloWorldServiceImpl implements HelloWorld {
    @Override
    public String sayHello(String name) {
        return "hello ," + name;
    }

    @Override
    public String sendSms(String mobile, String content, String platform) {
        try {
            // 模拟调用短信接口费时2s
            Thread.sleep(2000);
            return String.format("发送结果: %s, 手机号: %s, 内容: %s, 平台: %s", "SUCCESS", mobile, content, platform);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "send sms failure";
    }

    @Override
    public String printUserInfo(UserVo userVo) {
        return userVo.toString();
    }
}
