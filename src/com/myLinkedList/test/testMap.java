package com.myLinkedList.test;

import java.util.*;

import static java.lang.System.nanoTime;

public class testMap {

    public static void main(String[] args) {

        HashMap<Integer, Integer> ha = new HashMap<>();
        LinkedHashMap<Integer, Integer> li = new LinkedHashMap<>();
        TreeMap<Integer, Integer> tr =new TreeMap<>();


        for(int i=0;i<100;i++){

            testAdd(ha, li, tr,1000000);

            testRemove(ha, li, tr,1000000);

        }

    }

    public static void testAdd(HashMap ha, LinkedHashMap li, TreeMap tr, int kolell){

        long t1 = nanoTime();
        for (int i=0;i<kolell;i++){
            ha.put(i, i);
        }
        long t2 = nanoTime();
        System.out.println((t2-t1));

    }

    public static void testRemove(HashMap ha, LinkedHashMap li, TreeMap tr, int kolell){

        long t1 = nanoTime();
        for (int i=0;i<kolell;i++){
            ha.remove(i,i);
        }
        long t2 = nanoTime();
        System.out.println((t2-t1));

    }
}
