package DSA.Stack;

import java.util.Arrays;

class Stack {
    int[] arr;
    int top;

    public Stack(int size) {
        arr = new int[size];
        top = -1;
    }

    boolean isFull() {
        return top == arr.length - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(int x) {
        if (!isFull()) {
            arr[++top] = x;
        } else {
            System.out.println("stack is full");
        }
    }

    void pop() {
        if (!isEmpty()) {
            top--;
        } else {
            System.out.println("stack is empty");
        }
    }

    int peek() {
        if (isEmpty()) {
            throw new RuntimeException("stack is empty");
        }
        return arr[top];
    }

    void print() {
        System.out.println(Arrays.toString(arr));
    }
}

public class Main {
    public static void main(String[] args) {
        Stack stk = new Stack(5);
        stk.push(34);
        stk.push(23);
        stk.print();
        stk.pop();
        stk.print();
        System.out.println(stk.peek());
    }
}
