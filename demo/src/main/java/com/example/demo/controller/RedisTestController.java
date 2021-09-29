package com.example.demo.controller;

import com.example.demo.DemoApplication;
import com.example.demo.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import redis.clients.jedis.Jedis;

@Controller
@SpringBootApplication
public class RedisTestController {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    private void test() throws Exception {
        stringRedisTemplate.opsForValue().set("aaa","111");
        Assert.assertEquals("111",stringRedisTemplate.opsForValue().get("aaa"));
    }

    @Test
    public void testObj() throws Exception {
        User user = new User();
    }

    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost");
        System.out.printf("连接成功");
        System.out.println("服务正在运行： " + jedis.ping());
        SpringApplication.run(RedisTestController.class, args);
    }
}
