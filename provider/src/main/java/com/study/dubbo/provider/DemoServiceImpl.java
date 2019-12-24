package com.study.dubbo.provider;

import com.study.dubbo.DemoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @version v1.0
 * @author: yubiao
 * @date: 2019/12/24 15:42
 * @description:
 */
@Service
public class DemoServiceImpl implements DemoService{

    public String sayHello(String name) {
        System.out.println("*********************** " + name);
        return "Hello " + name;

    }
}
