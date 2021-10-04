package com.example.demo;

import java.util.HashMap;
import java.util.Scanner;

/**
 * author heqiang
 * leetcode  1. 两数之和
 * date 2021/07/28
 */
public class TwoNumAdd {

    public static void main(String[] args) {
        int [] nums = new int[1024];
        Scanner scanner = new Scanner(System.in);

    }

    //暴力破解，剪了一些枝
    public static int[] twoSum(int[] nums, int target) {
        int[] resultNum = new int[2];
        int flag = 0;
        for(int i = 0;i<nums.length;i++){
            for(int j = i + 1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    resultNum[0] = i;
                    resultNum[1] = j;
                    flag = 1;
                    break;
                }
            }
            if(flag == 1){
                break;
            }
        }
        return resultNum;
    }

    //看了题解，使用hash
    public static int[] twoSum2(int[] nums, int target) {
        int[] resultNum = new int[2];
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i = 0;i < nums.length; i++){
            if(hashMap.containsKey(nums[i])){
                resultNum[0] = hashMap.get(nums[i]);
                resultNum[1] = i;
                return resultNum;
            }
            hashMap.put(target - nums[i],i);
        }
        return resultNum;
    }
}
