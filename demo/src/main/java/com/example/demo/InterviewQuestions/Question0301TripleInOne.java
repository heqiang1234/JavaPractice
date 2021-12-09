package com.example.demo.InterviewQuestions;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Arrays;

/**
 * @program: demo
 * @description: 面试题 03.01. 三合一
 * @author: Mr.He
 * @create: 2021-12-09 17:36
 **/
public class Question0301TripleInOne {

    public int[] nums = null;
    public int indexNum = 0;

    public class TripleInOne {

        public TripleInOne(int stackSize) {
            nums = new int[stackSize];
            Arrays.fill(nums, Integer.MAX_VALUE);
        }

        public void push(int stackNum, int value) {
            if (indexNum <= nums.length - 1) {
                if (nums[indexNum] == Integer.MAX_VALUE) {
                    nums[indexNum++] = value;
                }
            }
        }

        public int pop(int stackNum) {
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] != Integer.MAX_VALUE) {
                    int tmp = nums[i];
                    nums[i] = Integer.MAX_VALUE;
                    return tmp;
                }
            }
            return -1;
        }

        public int peek(int stackNum) {
            for (int i = nums.length - 1; i >= 0; i--) {
                if (nums[i] != Integer.MAX_VALUE) {
                    return nums[i];
                }
            }
            return -1;
        }

        public boolean isEmpty(int stackNum) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != Integer.MAX_VALUE) {
                    return false;
                }
            }
            return true;
        }
    }

/**
 * Your TripleInOne object will be instantiated and called as such:
 * TripleInOne obj = new TripleInOne(stackSize);
 * obj.push(stackNum,value);
 * int param_2 = obj.pop(stackNum);
 * int param_3 = obj.peek(stackNum);
 * boolean param_4 = obj.isEmpty(stackNum);
 */
}
