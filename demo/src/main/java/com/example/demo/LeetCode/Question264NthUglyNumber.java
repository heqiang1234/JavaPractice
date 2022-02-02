package com.example.demo.LeetCode;

import java.util.*;

/**
 * @program: demo
 * @description: 264. 丑数 ||
 * @author: Mr.He
 * @create: 2022-01-14 19:04
 **/
public class Question264NthUglyNumber {
    //优先队列
    public static int nthUglyNumber(int n) {
        int[] tempNum = {2, 3, 5};
        Queue<Long> queue = new PriorityQueue<>();
        Set<Long> set = new HashSet<>();
        queue.add(1L);
        for (int i = 1; i <= n; i++) {
            Long x = queue.poll();
            if (n == i) {
                return x.intValue();
            }
            for (int j = 0; j < tempNum.length; j++) {
                long t = x * tempNum[j];
                if (!set.contains(t)) {
                    queue.add(t);
                    set.add(t);
                }
            }
        }
        return 0;
    }

    public static int getNum(int n) {
        int[] res = new int[n + 1];
        res[1] = 1;
        for (int i2 = 1,i3 = 1,i5 = 1,idx = 1; idx <= n; idx++) {
            int a= res[i2] * 2,b= res[i3] * 3,c= res[i5] * 5;
            int minNum = Math.min(a,Math.min(b,c));
            if (a == minNum) i2++;
            if (b == minNum) i3++;
            if (c == minNum) i5++;
            res[idx] = minNum;
        }
        return res[n];
    }

    public static void main(String[] args) {
        System.out.println(getNum(10));
    }

    Queue<Integer> queue1 = new io.netty.util.internal.PriorityQueue<Integer>() {
        @Override
        public boolean removeTyped(Integer integer) {
            return false;
        }

        @Override
        public boolean containsTyped(Integer integer) {
            return false;
        }

        @Override
        public void priorityChanged(Integer integer) {

        }

        @Override
        public void clearIgnoringIndexes() {

        }

        @Override
        public boolean add(Integer integer) {
            return false;
        }

        @Override
        public boolean offer(Integer integer) {
            return false;
        }

        @Override
        public Integer remove() {
            return null;
        }

        @Override
        public Integer poll() {
            return null;
        }

        @Override
        public Integer element() {
            return null;
        }

        @Override
        public Integer peek() {
            return null;
        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Integer> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Integer> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }
    };
}
