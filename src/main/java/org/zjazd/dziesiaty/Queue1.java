package org.zjazd.dziesiaty;

import java.util.Arrays;

public class Queue1 <T> extends Collection<T> implements PushPop<T> {
    private int index = 0;

    public static void main(String[] args) {
        Queue1<Integer> queue = new Queue1<>(5);
        Stack1<String> stack = new Stack1<>(6);

        for(int i=0; i<7; i++) {
            queue.push(i);
        }
        for (int i = 0; i < 7; i++) {
            String s = "haha";
            stack.push(s+i);
        }

        for(int i =0; i < 4; i++) {
            System.out.println("queue: " + queue.pop());
        }
        for (int i = 0; i <4; i++) {
            System.out.println("stack: " +  stack.pop());
        }

        System.out.println(Arrays.toString(stack.array));
        System.out.println(Arrays.toString(queue.array));
    }

    Queue1(int i) {
        array = (T[]) new Object[i];
    }

    @Override
    public T pop() {
        T result = array[0];
        for(int i = 0; i<array.length; i++) {
            if(i+1 < array.length) {
                array[i] = array[i+1];
            }
        }
        return result;
    }

    @Override
    public void push(T item) {
        if(index < array.length) {
            array[index] = item;
            index++;
        } else
            System.out.println("full");
    }
}

class  Collection <T> {
    public T[] array;
}
class Stack1 <T> extends Collection<T> implements PushPop<T> {
    private int index = 0;
    Stack1(int i) {
        array = (T[]) new Object[i];
    }
    @Override
    public T pop() {
        T result = array[index-1];
        index --;
        return result;
    }

    @Override
    public void push(T item) {
        if(index < array.length) {
            array[index] = item;
            index++;
        } else
            System.out.println("full");
    }
}

interface PushPop <T>{
    T pop();
    void push(T item);
}
