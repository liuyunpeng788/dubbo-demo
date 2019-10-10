package com.person.dubbo.server.service;

import com.person.dubbo.server.vo.UserVo;

/**
 * @author liumch
 * create :  2019/10/9 19:38
 **/

public interface HelloWorld {
    String sayHello(String name);
    /**
     * 定义一个发短信的接口
     * @param mobile 手机号
     * @param content 内容
     * @param platform 平台
     * @return 正常返回发送成功，失败即可，这里为了展示发送的手机号与内容平台，直接把内容再返回去
     */
    String sendSms(String mobile, String content, String platform);


    /**
     * 测试是否可以传递对象参数
     * @param userVo 用户信息
     */
    String printUserInfo(UserVo userVo);
}
