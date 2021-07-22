package com.example.demo;


import com.example.demo.Controller.ListNode;
import com.google.common.base.CaseFormat;

import javax.swing.*;
import java.io.File;
import java.lang.reflect.Field;

import java.util.*;

/**
 * @author hq
 * @date 20210709
 */
public class Test {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
        {
            return null;
        }
        ListNode n = headA;
        ListNode m = headB;
        System.out.println(headA);
        System.out.println(headB);
        while(n != m)
        {
            if(n == null)
            {
                n = headB;
            }
            else
            {
                System.out.println("N" + n.val);
                n = n.next;
            }

            if(m == null)
            {
                m = headA;
            }
            else
            {
                System.out.println("M" + m.val);
                m = m.next;
            }
            System.out.println(n);
            System.out.println(m);
            //System.out.println(m.equals(n));
        }
        //System.out.println(n.val);
        return n;

    }
    public static  void QucikSort(int[] arr,int left,int right){
        if(left > right){
            return;
        }
        int iNum,jNum,baseNum,swapNum;
        baseNum = arr[left];
        iNum = left;
        jNum = right;
        while(iNum != jNum){
            while (iNum < jNum && arr[jNum] >= baseNum){
                jNum--;
            }
            while(iNum < jNum && arr[iNum] <= baseNum){
                iNum++;
            }
            swapNum = arr[iNum];
            arr[iNum] = arr[jNum];
            arr[jNum] = swapNum;
        }
        arr[left] = arr[iNum];
        arr[iNum] = baseNum;
        QucikSort(arr,left,iNum - 1);
        QucikSort(arr,iNum + 1, right);

    }

    public static int search(int[] nums, int target) {
        int len = nums.length;
        int count = 0;
        for(int i = 0 ,j= len - 1; i<len ; i++ ,j--){
            if(i> j) {
                break;
            }
            else{
                if(nums[i] == target){
                    count++;
                }
                if(nums[j] == target){
                    count++;
                }
            }
        }
        return count;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) throws Exception{
//        int[] numsTemp ={5,7,7,8,8,10};
//        int times = search(numsTemp,8);
//        System.out.println(times);
        Scanner scanner = new Scanner(System.in);
        int[] array = {6, 2, 4, 8, 9, 5, 7, 3, 1, 10};
        System.out.println("排序之前的数组: " + Arrays.toString(array));
        QucikSort(array, 0, array.length - 1);
        System.out.println("排序之后的数组: " + Arrays.toString(array));
//        ListNode nodeControl = new ListNode();
//        nodeControl.add(4);
//        nodeControl.add(1);
//        nodeControl.add(8);
//        nodeControl.add(4);
//        nodeControl.add(5);
//        ListNode nodeControlTwo = new ListNode();
//        nodeControlTwo.add(5);
//        nodeControlTwo.add(0);
//        nodeControlTwo.add(1);
//        nodeControlTwo.add(8);
//        nodeControlTwo.add(4);
//        nodeControlTwo.add(5);
//        ListNode nodeResult = getIntersectionNode(nodeControl,nodeControlTwo);
//        System.out.println(nodeResult);



//        char a = 'a';
//        int w = a;
//        char[][] aV = new char[3][];
//        String aB = "aa";
//        float c = 1.2f;
//        double d =1.2d;
//        double e =1.2f;
//        System.out.println(aB.length());
//        System.out.println( aV.length);
//        HashMap hashMap = new HashMap();
//        StringBuffer stringBuffer = new StringBuffer();
//        stringBuffer.append("dads");
//        stringBuffer.append(1);
//        stringBuffer.append(1);
//        stringBuffer.append("测试");
//        System.out.println(stringBuffer.toString());
//        System.out.println(stringBuffer.getClass().getName());
//        System.out.println(stringBuffer.getClass().getDeclaredConstructors());
//        List<Person> list = new ArrayList<Person>();
//        Class<Person> clazz = Person.class;
//        Field[] fields = clazz.getDeclaredFields();
//
//        String keyValue;
//        String setMethodName;
//        StringBuilder stringBuilder = new StringBuilder();
////
//
//        HashMap hashMapT = new HashMap();
//        List<HashMap> hashMapList = new ArrayList<>();
//        hashMapT.put("steshi","sdsda");
//        hashMapT.put("a","b");
//        System.out.println(hashMapT.get("a"));
//        hashMapList.add(hashMapT);
//        for (HashMap hashMapTemp:hashMapList) {
//            System.out.println(hashMapTemp.get("steshi"));
//        }
//
//        Hashtable hashtable = new Hashtable();
//
//        hashMap.put(1,"2");
//        System.out.println();
//        char[] ad = aB.toCharArray();
//        System.out.println(d+" "+e);
    }
}

