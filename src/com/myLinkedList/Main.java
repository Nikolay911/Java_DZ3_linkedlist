package com.myLinkedList;

import com.myLinkedList.test.myInt;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        MyLinkedList<myInt> one = new MyLinkedList<>();



        System.out.println(one.size());

        one.add(new myInt(12));
        one.add(new myInt(33));
        one.add(new myInt(34));
        one.add(new myInt(335));
        one.add(new myInt(6));
        one.add(new myInt(337));

        one.add(1,new myInt(777));
        one.add(new myInt(888));
        one.printAllElement();
        System.out.println("size: " + one.size());
        System.out.println("===============================");

        Iterator<myInt> iter = one.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }



        System.out.println("===============================");
        one.set(2,new myInt(345));
        System.out.println(one.get(2));


        System.out.println("===============================");
        one.printAllElement();
        System.out.println("===============================");
        one.remove(4);
        one.printAllElement();

        System.out.println("===============================");
        one.remove(1);
        one.printAllElement();
        System.out.println("get ell  " +  one.get(1) +"  "+  one.get(2));
        System.out.println("size: " + one.size());


        System.out.println("indexOf: " + one.indexOf(new myInt(345)));
        System.out.println("indexOf: " + one.indexOf(new myInt(33)));



        int lenght = one.size();
        myInt[] mass = one.toArray();

        for(int i=0;i<lenght;i++){
            System.out.println("print massiv " + mass[i]);
        }

        System.out.println("===============================");
        one.clear();
        one.printAllElement();
        System.out.println("size: " + one.size());
        System.out.println("===============================");

    }

}
