package com.myLinkedList;

import com.myLinkedList.test.myInt;

import java.util.LinkedList;

import static java.lang.System.*;

public class LinkedTest {

    public static void testAdd(MyLinkedList one, LinkedList two, int kolell){

        long t3 = nanoTime();
        for(int i = 0; i <=kolell; i++){
            two.add(new myInt(i));
        }
        long t4 = nanoTime();
        System.out.println("Time LinkedList to add " + kolell + " ellementov    " + (t4-t3));

        long t1 = nanoTime();
        for(int i = 0; i <=kolell; i++){
            one.add(new myInt(i));
        }
        long t2 = nanoTime();
        System.out.println("Time MylinkedList to add " + kolell + " ellementov  " + (t2-t1));

    }

    public static void testRemove(MyLinkedList one, LinkedList two, int kolell){



        long t3 = nanoTime();
        for(int i = 0; i <kolell/2; i++){
            two.remove(kolell/2-i);
        }
        long t4 = nanoTime();
        System.out.println("Time LinkedList to remove " + kolell/2 + " ellementov    " + (t4-t3));
        System.out.println((t4-t3));
        long t1 = nanoTime();
        for(int i = 0; i < kolell/2; i++){
            one.remove(kolell/2-i);
        }
        long t2 = nanoTime();
        //System.out.println("Time MylinkedList to remove " + kolell/2 + " ellementov  " + (t2-t1));
        System.out.println((t2-t1));

    }
}
