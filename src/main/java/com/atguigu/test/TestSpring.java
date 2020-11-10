package com.atguigu.test;

import com.atguigu.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : Administrator
 * @date : 2020-11-10 14:55
 * @description ：
 */
public class TestSpring {
    @Test
    public void run1(){

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        AccountService service = applicationContext.getBean(AccountService.class);

        service.findAll();
    }
}