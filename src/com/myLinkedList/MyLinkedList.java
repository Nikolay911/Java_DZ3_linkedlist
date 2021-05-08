package com.myLinkedList;

import com.p.Circle;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

public class MyLinkedList<E> implements ILinkedList<E> {
    public Node<E> fst;
    public Node<E> lst;
    private int size = 0;

    public MyLinkedList() {

    }

    public void add(E element) {
        Node<E> last = lst;
        Node<E> newNode = new Node(last, element, null);
        lst = newNode;
        if (last == null) {
            fst = newNode;
        } else {
            last.next = newNode;
        }

        size++;
    }

    public void addFirst(E element) {
        Node<E> f = this.fst;
        Node<E> newNode = new Node(null, element, f);
        this.fst = newNode;
        if (f == null) {
            this.lst = newNode;
        } else {
            f.prev = newNode;
        }

        ++this.size;
    }

    public void add(int index, E element) {
        if (index <= this.size && index >= 1) {
            if (index == this.size + 1) {
                this.add(element);
            } else if (index == 1) {
                this.addFirst(element);
            } else {
                Node<E> curr = this.fst;

                for(int i = 0; i < index; ++i) {
                    curr = curr.next;
                }

                Node<E> insert = new Node(curr, element, curr.next);
                curr.next = insert;
                ++this.size;
            }
        } else {
            System.out.println("Out of size list");
        }

    }

    public void clear() {
       Node next;
        for(Node x = fst; x != null; x = next) {
            next = x.next;
            x.item = null;
            x.next = null;
            x.prev = null;
        }

        this.fst = this.lst = null;
        this.size = 0;
    }

    public E get(int index) {
        if (0 < index && index <= this.size) {
            Node<E> curr = this.fst;

            for(int i = 1; i < index; ++i) {
                curr = curr.next;
            }

            return curr.item;
        } else {
            return (E) "index out of range";
        }
    }

    public int indexOf(E element) {
        int index = 0;
        Node<E> x = fst;

        for(int i = 1; i <= size; ++i) {
            if (element.equals(x.item)) {
                return index + 1;
            }

            x = x.next;
            ++index;
        }

        return -1;
    }

    public E remove(int index) {
        if (index > 0 && index <= size) {
            if (index == 1) {
                this.removeFirst();
                return null;
            } else if (index == size) {
                this.removeLast();
                return null;
            } else {
                MyLinkedList.Node<E> curr = fst;

                for(int i = 1; i < index; ++i) {
                    curr = curr.next;
                }

                curr.prev.next = curr.next;
                curr.next.prev = curr.prev;
                --this.size;
                return curr.item;
            }
        } else {
            System.out.println("Ошибочка!");
            return (E) "eror";
        }
    }

    public E removeLast() {
        MyLinkedList.Node<E> last = lst;
        MyLinkedList.Node<E> lastpr = last;
        last = last.prev;
        lst = last;
        lst.next = null;
        size--;
        return lastpr.item;
    }

    public E removeFirst() {
        MyLinkedList.Node<E> first = fst;
        first = first.next;
        fst = first;
        fst.prev = null;
        size--;
        return first.item;
    }

    public E set(int index, E element) {
        if (0 < index && index <= this.size) {
            MyLinkedList.Node<E> newVal = this.fst;

            for(int i = 1; i < index; ++i) {
                newVal = newVal.next;
            }

            E oldVal = newVal.item;
            newVal.item = element;
            return oldVal;
        } else {
            return (E) "error";
        }
    }

    public int size() {
        return this.size;
    }

    public E[] toArray() {

        try {
            Class clazz = Class.forName("com.myLinkedList.test.myInt");

            E[] result = (E[]) Array.newInstance(clazz, this.size);
            Iterator iter = this.iterator();

            for (int i = 0; i<size; i++) {
                result[i] = this.get(i+1);
                //System.out.println("result[var2++]  " + result[i]);

            }
            return result;
        }
        catch (ClassNotFoundException var5){
            var5.printStackTrace();
            return null;
        }
    }

    public String toString() {
        String str = "";
        MyLinkedList.Node<E> node = this.fst;

        for(int i = 1; i <= this.size; ++i) {
            str = str + node.item + " ";
            node = node.next;
        }

        return str;
    }

    public void printAllElement() {
        MyLinkedList.Node<E> target = this.fst;

        for(int i = 1; i <= this.size; ++i) {
            System.out.println(target.item);
            target = target.next;
        }

    }

    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int counter = 0;

            public boolean hasNext() {
                return this.counter < MyLinkedList.this.size;
            }

            public E next() {
                return MyLinkedList.this.get(this.counter++);
            }
        };
    }

    private static class Node<E> {
        public E item;
        MyLinkedList.Node<E> next;
        MyLinkedList.Node<E> prev;

        Node(MyLinkedList.Node<E> prev, E element, MyLinkedList.Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
