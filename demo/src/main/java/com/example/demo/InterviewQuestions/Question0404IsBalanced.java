package com.example.demo.InterviewQuestions;

/**
 * @program: demo
 * @description: 面试题 04.04. 检查平衡性
 * @author: Mr.He
 * @create: 2021-12-31 10:49
 **/
public class Question0404IsBalanced {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }

    public  boolean isBalanced(TreeNode head){
        if (head == null) {
            return false;
        }
        return true;
    }

    public TreeNode getTree(TreeNode root) {
        return null;
    }
}
