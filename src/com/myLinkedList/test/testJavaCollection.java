package com.myLinkedList.test;

import java.util.ArrayList;
import java.util.LinkedList;

import static java.lang.System.nanoTime;

public class testJavaCollection {

    public static void main(String[] args) {

        ArrayList<myInt> arr = new ArrayList<>();
        LinkedList<myInt> lin = new LinkedList<>();

        for(int i=0;i<100;i++){
            testAdd(arr,lin,100000);
            //System.out.println(arr.size());
            testRemove(arr,lin,100000);

        }
        //testRemove(arr,lin,10000);

    }

    public static void testAdd(ArrayList arr, LinkedList lin, int kolell){

        long t1 = nanoTime();
        for (int i=0;i<kolell;i++){
            lin.add(new myInt(i));
        }
        long t2 = nanoTime();
        //System.out.println((t2-t1));

    }

    public static void testRemove(ArrayList arr, LinkedList lin, int kolell){

        long t1 = nanoTime();
        for (int i=1;i<kolell;i++){
            lin.remove(0);
           // System.out.println(i);
        }
        long t2 = nanoTime();
        System.out.println((t2-t1));

    }


}
