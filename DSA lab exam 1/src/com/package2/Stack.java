package com.package2;


public class Stack {
    int[] array;
    int top;
    int size;
    int capacity;
    Stack(int capacity){
        this.capacity=capacity;
        array= new int[capacity];
        top=-1;
        size=0;


    }
    int size(){
        return size;
    }
    void push(int value){

        if( top < capacity-1){
            array[++top]=value;
            size++;
        }else {
            System.out.println("the stack is full");
        }


    }
    int pop(){
        if ( top>=0){
            int data = array[top--];
            size--;
            return data;
        }

        return -1;
    }
    int peek(){
        if ( top>=0){
            int data = array[top];

            return data;
        }

        return -1;



    }
    boolean isEmpty(){
        return size==0;
    }
    boolean isFull(){
        return size==array.length;
    }



    public static void main(String[] args) {
        Stack  stack = new Stack(5);
        stack.isEmpty();
        stack.isFull();
        stack.push(10);
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.pop();
        stack.peek();
        stack.isEmpty();
        stack.isFull();

        for ( int i =0; i< stack.size;i++){
            System.out.println(stack.array[i]);
        }

    }
}
