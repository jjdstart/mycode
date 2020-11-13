package com.jjd.datastructures.statck;

import java.util.Iterator;

/**
 * @author jjd
 * @date 2020-10-22
 */
public class Stack<T> implements Iterable<T> {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>(10);
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        stack.push("e");
        System.out.println("当前栈长度 = " + stack.size());

        for (String s : stack) {
            System.out.println(s);
        }
    }

    private T[] a;
    private int size;

    public Stack(int size) {
        a = (T[]) new Object[size];
    }


    public void push(T t) {
        if (size == a.length) {
            resize(size * 2);
        }
        a[size++] = t;
    }


    public T pop() {
        T t = a[--size];
        a[size] = null;
        if (size > 0 && size == a.length / 4) {
            resize(a.length / 2);
        }
        return t;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }


    private void resize(int maxSize) {
        T[] temp = (T[]) new Object[size];
        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
        a = temp;
    }

    @Override
    public Iterator<T> iterator() {
        return new ReverseArrayIterator();
    }


    private class ReverseArrayIterator implements Iterator<T> {

        private int i = size;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public T next() {
            return a[--i];
        }
    }
}


