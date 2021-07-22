package com.example.demo;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;
    public String name;
    public String pwd;
    public int age;
}

