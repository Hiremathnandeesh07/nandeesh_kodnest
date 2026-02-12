package lamdaFunctions;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i+1);
        }
        int sum=0;
       sum=arr.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);
    }


}
