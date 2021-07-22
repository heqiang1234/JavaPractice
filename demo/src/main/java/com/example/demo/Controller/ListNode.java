package com.example.demo.Controller;

/**
 *
 */
public class ListNode {
    public int val;
    public ListNode next;
    public  ListNode(int x){
        val = x;
    }
    public ListNode(){}

//    public boolean add(int val){
//        ListNode newNode = new ListNode(val);
//        if(head == null){
//            head = newNode;
//            return true;
//        }
//        ListNode nodeTemp = head;
//        if(nodeTemp != null){
//            nodeTemp =  nodeTemp.next;
//        }
//        nodeTemp.next = head;
//        return true;
//    }
//添加结点
public void add(int newdata){
    ListNode newNode = new ListNode(newdata);    //创建一个结点
    if(this.next == null){
        this.next  = newNode;
    }
    else{
        this.next.add(newdata);
    }
}
}