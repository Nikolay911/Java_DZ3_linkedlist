package com.myLinkedList.test;

import java.util.Objects;

public class myInt implements Comparable{
    int x;
    public myInt(){}

    public myInt(int value) {
        this.x = value;
    }

    public myInt(myInt value) {
        this.x = value.x;
    }

    public String toString() {
        return "myInt{x=" + this.x + "}";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            myInt myInt = (myInt)o;
            return this.x == myInt.x;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.x});
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
