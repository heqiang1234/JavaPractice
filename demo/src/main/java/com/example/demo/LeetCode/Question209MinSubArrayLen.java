package com.example.demo.LeetCode;

import java.util.HashMap;

/**
 * @program: demo
 * @description: 209. 长度最小的子数组
 * @author: Mr.He
 * @create: 2022-03-06 21:31
 **/
public class Question209MinSubArrayLen {

    public int minSubArrayLen(int target, int[] nums) {
        HashMap<Integer,Integer> res = new HashMap<>();
        int ret = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ret = Math.min()
        }
    }

    public static void main(String[] args) {

    }
}
