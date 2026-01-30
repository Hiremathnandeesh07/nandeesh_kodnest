import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;

class  Main{
    public static void main(String[] args) {


        CustomArrayList customArray=new CustomArrayList();

        customArray.add(34);
        customArray.printArray();
        System.out.println(customArray.remove());

    }
}

class CustomArrayList {
    private int[] arr;
    private static final int DEFAULT_SIZE = 10;
    private int size = 0;

    CustomArrayList() {
        arr = new int[DEFAULT_SIZE];
    }

    public void add(int v) {
        if(size==arr.length){
            resize();
        }
        arr[size++]=v;

    }

    public int remove(){

        return arr[--size];
    }

    private void resize() {
        int[] newArray=new int[arr.length*2];
        for (int i = 0; i < arr.length; i++) {
            newArray[i]=arr[i];
        }
        arr=newArray;

    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    public void printArray() {
        System.out.println(toString());

    }
}
