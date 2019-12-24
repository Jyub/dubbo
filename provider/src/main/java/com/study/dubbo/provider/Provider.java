package com.study.dubbo.provider;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/12/24 15:42
 * @description:
 */
@Service
public class Provider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();

        System.in.read();
    }

}
