package com.study.dubbo.consumer;

import com.study.dubbo.DemoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/12/24 15:42
 * @description:
 */
@Service
public class ConsumerImpl{

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法
        System.out.println(hello); // 显示调用结果

        System.out.println();
        System.out.println(demoService);
        context.close();
    }

}
