package com.example.demo.controller;

import com.example.demo.DemoApplication;
import com.example.demo.config.RedisConfig;
import com.example.demo.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.stereotype.Controller;
import redis.clients.jedis.Jedis;

@SpringBootApplication
@EnableRedisHttpSession
public class RedisTestController {

    public static void main(String[] args) {
//        Jedis jedis = new Jedis("121.40.43.57");
//        System.out.printf("连接成功");
//        System.out.println("服务正在运行： " + jedis.ping());
//       // test();
//       //
        SpringApplication.run(RedisTestController.class, args);
    }

}
