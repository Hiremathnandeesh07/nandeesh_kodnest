package twoDarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TwoDimensionArray {

    static void main(String[] args) {
        ArrayList<ArrayList<Integer>> grid=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> newRow=new ArrayList<>();
            for (int j = 0; j < m; j++) {
                newRow.add(sc.nextInt());
            }
            grid.add(newRow);
        }

        for (int i = 0; i < n; i++) {
            System.out.println(grid.get(i).toString());
        }
    }
}




//static void main(String[] args) {
//    Scanner sc=new Scanner(System.in);
//    ArrayList<ArrayList<Integer>> grid=new ArrayList<>();
//    int n=sc.nextInt();
//    int m=sc.nextInt();
//    for(int i=0;i<n;i++){
//        ArrayList<Integer> row=new ArrayList<>();
//        for(int j=0;j<m;j++){
//            row.add(sc.nextInt());
//        }
//        grid.add(row);
//    }
//    System.out.println("printing all the letters");
//    for(int i=0;i<n;i++){
//        System.out.println(grid.get(i).toString());
//    }