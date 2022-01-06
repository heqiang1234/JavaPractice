package com.example.demo.LeetCode;

import java.util.Stack;

/**
 * @program: demo
 * @description: 71. 简化路径
 * @author: Mr.He
 * @create: 2022-01-06 09:35
 **/
public class Question71SimplifyPath {

    public static String simplifyPath( String path){
        StringBuilder stringBuilder = new StringBuilder("/");
        char[] res = path.toCharArray();
        Stack<String> stack = new Stack();
        int count = 0;
        while (count <= res.length) {
            if(res[count] == '/'){
                StringBuilder str = new StringBuilder(); //定义一个变量来存储路径
                while (res[count + 1] != '.' && res[count + 1] != '/'){
                    str.append(res[count]);
                    count++;
                }
            } else if(res[count] == '.'){
                if (res[count + 1] == '.' && res[count + 2] == '/') {
                }
                }
            }
        }
        for (int i = 0; i < res.length - 2; i++) {
            if (res[i] == '.'){
                if()
            }

        }
        return "/";
    }
}
