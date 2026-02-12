package Patterns;

import java.util.ArrayList;
import java.util.Scanner;

public class Rectangle {
    static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        System.out.println("printing the rectangle---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
