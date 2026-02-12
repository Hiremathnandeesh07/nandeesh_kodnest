package Patterns;
/*
        **********
        *        *
        *        *
        *        *
        *        *
        *        *
        *        *
        *        *
        *        *
        **********
*/
public class HollowRectangle {
    static void main(String[] args) {
        int n=10;
        int m=10;
        for (int i = 0; i < m; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < n-2; i++) {


            System.out.print("*");
            for ( int j = 1; j < m - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < m; i++) {
            System.out.print("*");
        }
    }
}
