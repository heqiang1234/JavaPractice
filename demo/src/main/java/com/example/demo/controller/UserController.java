package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @AutoWired
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    //    @RequestMapping("/getUser")
//    @Cacheable(value = "user-key")
//    public User getUser() {
//        User user = new User();
//        user.setUserName("HQ");
//        user.setUserPassword("123");
//        user.setUserEmail("1401651730@qq.com");
//        user.setNickName("小何");
//        user.setRegTime("202100928");
//        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
//        ruser.setId(123L);
//      eturn user;
//    }
}
