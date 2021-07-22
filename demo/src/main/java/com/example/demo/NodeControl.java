package com.example.demo;

import com.example.demo.Controller.ListNode;

public class NodeControl {
    private ListNode head = null;

    public boolean add(int val){
        ListNode newNode = new ListNode(val);
        if(head == null){
            head = newNode;
            return true;
        }
        ListNode nodeTemp = head;
        if(nodeTemp != null){
            nodeTemp =  nodeTemp.next;
        }
        nodeTemp.next = head;
        return true;
    }
}
