package org.zjazd.drugi;

import java.util.Arrays;

public class Queue extends collection implements pushpop {
    private int index = 0;
    int popIndex = 0;
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        Stack stack = new Stack(6);


        for(int i=0; i<7; i++) {
            queue.push(i);
            stack.push(i);
        }

        for(int i =0; i<4; i++) {
            System.out.println("queue: " + queue.pop());
        }
        for (int i = 0; i <4; i++) {
            System.out.println("stack: " +  stack.pop());
        }

        System.out.println(Arrays.toString(stack.array));
        System.out.println(Arrays.toString(queue.array));
    }

    Queue(int i) {
        array = new int[i];
    }
    @Override
    public int pop() {
        int result = array[0];
        for(int i = 0; i<array.length; i++) {
            if(i+1<array.length) {
                array[i] = array[i+1];
            }
        }
        return result;
    }

    @Override
    public void push(int item) {
        if(index < array.length) {
            array[index] = item;
            index++;
        } else
            System.out.println("full");
    }
}

class Stack extends collection implements pushpop {
    private int index = 0;
    Stack(int i) {
        array = new int[i];
    }
    @Override
    public int pop() {
        int result = array[index-1];
        index --;
        return result;
    }

    @Override
    public void push(int item) {
        if(index < array.length) {
            array[index] = item;
            index++;
        } else
            System.out.println("full");
    }
}

class collection {
    public int[] array;
}

interface pushpop {
    int pop();
    void push(int item);
}


