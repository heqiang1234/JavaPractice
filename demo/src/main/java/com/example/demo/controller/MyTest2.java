package com.example.demo.controller;

import org.junit.Test;

import java.util.stream.Stream;

/**
 * @program: demo
 * @description: 2
 * @author: Mr.He
 * @create: 2022-03-09 16:01
 **/
public class MyTest2 {

    @Test
    public void test() {
        UserController userController = new UserController();
        Class<? extends UserController> clazz = userController.getClass();
        UserService userService = new UserService();

        Stream.of(clazz.getDeclaredFields()).forEach(field -> {
            System.out.println("field " + field);
            String name = field.getName();
            System.out.println("name " + name);

            AutoWired annotation = field.getAnnotation(AutoWired.class);
            if (annotation != null){
                field.setAccessible(true);
                //获取属性类型
                Class<?> type = field.getType();

                System.out.println("type "  + type);
                try {
                    Object o = type.newInstance();
                    field.set(userController,o);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println(userController.getUserService());
    }
}
