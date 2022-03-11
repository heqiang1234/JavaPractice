package com.example.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @program: demo
 * @description: spring
 * @author: Mr.He
 * @create: 2022-03-07 10:23
 **/
@Component
public class MainClass {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainClass.class);

        InstanceA instanceA = (InstanceA) ctx.getBean("instanceA");

        System.out.println(instanceA);
    }
}
