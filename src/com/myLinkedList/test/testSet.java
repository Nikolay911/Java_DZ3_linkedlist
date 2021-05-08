package com.myLinkedList.test;

import java.util.*;

import static java.lang.System.nanoTime;

public class testSet {

    public static void main(String[] args) {

        HashSet<Integer> ha = new HashSet<>();
        LinkedHashSet<Integer> li = new LinkedHashSet<>();
        TreeSet<Integer> tr =new TreeSet<>();

        for(int i=0;i<100;i++){

            testAdd(ha, li, tr,1000000);

            testRemove(ha, li, tr,1000000);


        }

    }

    public static void testAdd(HashSet ha, LinkedHashSet li, TreeSet tr, int kolell){

        long t1 = nanoTime();
        for (int i=0;i<kolell;i++){
            tr.add(new Integer(i));
        }
        long t2 = nanoTime();
        System.out.println((t2-t1));

    }

    public static void testRemove(HashSet ha, LinkedHashSet li, TreeSet tr, int kolell){

        long t1 = nanoTime();
        for (int i=0;i<kolell;i++){
            tr.remove(kolell-i);
        }
        long t2 = nanoTime();
        System.out.println((t2-t1));

    }



}
