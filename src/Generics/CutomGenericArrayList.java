package Generics;


class CustomGenericArrayList<T> {
    private Object[] arr;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    CustomGenericArrayList() {
        arr = new Object[DEFAULT_SIZE];
    }

    public void add(T v) {
        if (size == arr.length) {
            resize();
        }
        arr[size++] = v;
    }

    private void resize() {
        Object[] newArr = new Object[arr.length * 2];
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
