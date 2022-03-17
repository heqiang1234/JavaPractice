package com.example.demo.LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.apache.coyote.http11.Constants.a;

/**
 * @program: demo
 * @description: 720. 词典中最长的单词
 * @author: Mr.He
 * @create: 2022-03-17 15:42
 **/
public class Question720LongestWord {

    public static String Q(String[] words) {
        Arrays.sort(words, (a,b) ->{
            if (a.length() != b.length()){
                return a.length() - b.length();
            } else {
                return b.compareTo(a);
            }
        });
        String res = "";
        Set<String> set = new HashSet<>();
        set.add("");
        int n = words.length;
        for (int i = 0; i < n; i++) {
            String str = words[i];
            if (set.contains(str.substring(0, str.length() - 1))){
                set.add(str);
                res = str;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String []res = {"w","wo","wor","worl", "world"};
        System.out.println(Q(res));
    }
}
