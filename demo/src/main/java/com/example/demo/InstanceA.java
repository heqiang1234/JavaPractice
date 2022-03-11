package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: demo
 * @description: A对象
 * @author: Mr.He
 * @create: 2022-03-07 10:26
 **/
@Component
public class InstanceA {

    @Autowired
    private InstanceB instanceB;

    public InstanceB getInstanceB(){
        return instanceB;
    }

    public void setInstanceB(InstanceB instanceB){
        this.instanceB = instanceB;
    }
    public InstanceA(InstanceB instanceB){
        this.instanceB = instanceB;
    }

    public InstanceA(){
        System.out.println("InstanceA实例化");
    }
}
