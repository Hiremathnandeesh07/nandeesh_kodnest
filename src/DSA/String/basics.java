package DSA.String;

import java.util.Arrays;
import java.util.Collections;

public class basics {
    public static void findduplicate(String name) {
        int[] arr = new int[26];
//        System.out.println(Arrays.toString(arr));
        for(int i=0;i<name.length();i++) {
            arr[name.charAt(i) - 97] += 1;

        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>1){
                System.out.println((char)(i+97));
            }

        }


    }


    public static void main(String[] args) {
         String name="findings";
         findduplicate(name);

    }
}
