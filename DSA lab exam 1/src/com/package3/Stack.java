package com.package3;


class Stack {
    private final int maxSize;
    private final int[] stackArray;
    private int top;

    public Stack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack overflow");
            return;
        }
        stackArray[++top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}


class QueueUsingStacks {
    private final Stack stack1;
    private final Stack stack2;

    public QueueUsingStacks(int maxSize) {
        stack1 = new Stack(maxSize);
        stack2 = new Stack(maxSize);
    }

    public void enqueue(int item) {
        stack1.push(item);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean isEmpty() {
        return (stack1.isEmpty() && stack2.isEmpty());
    }

    public static void main(String[] args) {
        // Test the functionality of QueueUsingStacks
        QueueUsingStacks queue = new QueueUsingStacks(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Front item: " + queue.peek());
        System.out.println("Dequeued item: " + queue.dequeue());

        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println("Front item after dequeue: " + queue.peek());
    }
}
