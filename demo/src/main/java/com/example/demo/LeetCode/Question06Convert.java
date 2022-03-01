package com.example.demo.LeetCode;

/**
 * @program: demo
 * @description: 6. Z 字形变换
 * @author: Mr.He
 * @create: 2022-03-01 09:51
 **/
public class Question06Convert {

    public static String convert(String s, int numRows) {
        int len = s.length();
        StringBuilder str = new StringBuilder();
        int [][] arr = new int[numRows][]
        for (int i = 0; i < numRows; i++) {
            if (i > len) {
                break;
            }
            int j = i;
            while ( j <= len - 1){
                str.append(s.charAt(j));
                j =  j + numRows;
            }
        }
        return str.toString();
    }


    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3).length());
    }
}
