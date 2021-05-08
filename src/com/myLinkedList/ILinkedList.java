package com.myLinkedList;

public interface ILinkedList<E> extends Iterable<E> {
    void add(E var1);

    void addFirst(E var1);

    void add(int var1, E var2);

    void clear();

    E get(int var1);

    int indexOf(E var1);

    E remove(int var1);

    E removeLast();

    E removeFirst();

    E set(int var1, E var2);

    int size();

    E[] toArray();

    String toString();

    void printAllElement();
}