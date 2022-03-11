package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @program: demo
 * @description: B对象
 * @author: Mr.He
 * @create: 2022-03-07 10:26
 **/
@Component
public class InstanceB {

    @Autowired
    private InstanceA instanceA;

    public InstanceA getInstanceA(){
        return instanceA;
    }

    public void setInstanceA(InstanceA instanceA){
        this.instanceA = instanceA;
    }
    public InstanceB(InstanceA instanceA){
        this.instanceA = instanceA;
    }

    public InstanceB() {
        System.out.println("InstanceA实例化");
    }
}
