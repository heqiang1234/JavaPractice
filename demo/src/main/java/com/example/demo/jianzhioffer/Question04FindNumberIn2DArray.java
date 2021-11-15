package com.example.demo.jianzhioffer;

/**
 * @author HQ
 * @create 2021/11/13 19:49
 */
public class Question04FindNumberIn2DArray {

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        int len = 0,wid = matrix.length - 1;
//        while (wid > 0 && len <= matrix.length - 1) {
//            if (matrix[])
//        }


        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,   4,  7, 11, 15},
                          {2,   5,  8, 12, 19},
                          {3,   6,  9, 16, 22},
                          {10, 13, 14, 17, 24},
                          {18, 21, 23, 26, 30}};
        int target = 5;
        findNumberIn2DArray(matrix, 5);
    }
}
