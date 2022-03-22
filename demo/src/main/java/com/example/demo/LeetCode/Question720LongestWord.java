package com.example.demo.LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @program: demo
 * @description: 720. 词典中最长的单词
 * @author: Mr.He
 * @create: 2022-03-17 15:42
 **/
public class Question720LongestWord {

    public static String Q(String[] words) {
//        Arrays.sort(words, (a,b) ->{
//            if (a.length() != b.length()){
//                return a.length() - b.length();
//            } else {
//                return b.compareTo(a);
//            }
//        });
//        (o1, o2) -> o2 - o1)

       // Arrays.sort(words,(o1, o2) -> o2.length() - o1.length() );
       // sort(words,0,words.length - 1);
        String res = "";
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            set.add(words[i]);
        }
        for (String str: words) {
            int len1 = str.length();
            int len2 = res.length();
            if (len1 < len2){
                continue;
            }
            if (len1 == len2 && str.compareTo(res) > 0){
                continue;
            }
            Boolean flag = true;
            for (int i = 0; i < str.length(); i++) {
               if (!set.contains(str.substring(0,str.length() - i))){
                    flag = false;
                }
            }
            if (flag){
                res = str;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String []res = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        System.out.println(Q(res));
    }
}
