package com.example.demo.jianzhioffer;

/**
 * @program: demo
 * @description: 剑指 Offer 25. 合并两个排序的链表
 * @author: Mr.He
 * @create: 2021-12-01 17:36
 **/
public class Question25MergeTwoLists {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode l3 = null;
        if()
        while (l1 != null || l2 != null) {
            if(l1 != null && l2 != null) {
                if (l1.val > l2.val) {
                    l3 = l1;
                    l1 = l1.next;
                } else {
                    l3 = l1;
                }
            }
            if (l1 != null && l2 == null) {

            }

        }
    }
}
