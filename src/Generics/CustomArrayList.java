package Generics;


import java.util.Arrays;

class CustomArrayList {
    private int[] arr;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    CustomArrayList() {
        arr = new int[DEFAULT_SIZE];
    }

    public void add(int v) {
        if (size == arr.length) {
            resize();
        }
        arr[size++] = v;
    }

    private void resize() {
        int[] newArr = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
