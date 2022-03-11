package com.example.demo.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: demo
 * @description: de
 * @author: Mr.He
 * @create: 2022-03-09 20:38
 **/
public class MyTest3 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        MulService mulService = context.getBean("mulService", MulService.class);
        System.out.println(mulService);
    }
}
