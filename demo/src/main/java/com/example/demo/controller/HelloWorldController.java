package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    public String  OutputIndex(){

        HashMap hashMap = new HashMap();
        List<HashMap> hashMapList = new ArrayList<>();
        hashMap.put("steshi","sdsda");
        hashMap.put("a","b");
        System.out.println(hashMap.get("a"));

        return "Test";
    }
}
