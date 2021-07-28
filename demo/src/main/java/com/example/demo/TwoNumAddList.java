package com.example.demo;

/**
 * author heqiang
 * leetcode 2. 两数相加
 * date 2021/07/29
 */
public class TwoNumAddList {

      //Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    /**
     *
     *[9,9,9,9,9,9,9]
     * [9,9,9,9]
     * 输出：
     * [8,9,9,9,0,0,0]
     * 预期结果：
     * [8,9,9,9,0,0,0,1]
     *
     * @param l1
     * @param l2  这个样例暂时过不去，我要考虑下
     * @return
     */
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int l1Num = 0;
            int l2Num = 0;
            int[] numTemp = new int[20];
            int upNum = 0;
            int nowNum = 0;
            ListNode listResult = new ListNode();
            ListNode l3 = listResult;
            while(l1 != null || l2 != null){
                l1Num = 0;
                l2Num = 0;
                if(l1 != null){
                    l1Num = l1.val;
                }
                if(l2 != null){
                    l2Num = l2.val;
                }
                nowNum = upNum;
                if(l1Num + l2Num >= 10){
                    upNum = 1;
                }else{
                    upNum = 0;
                }

                nowNum += (l1Num + l2Num) % 10;

                l3.next = new ListNode(nowNum);
                l3 = l3.next;

                if(l1 != null){
                    l1 = l1.next;
                }
                if(l2 != null){
                    l2 = l2.next;
                }

            }
            return listResult.next;
        }
}
