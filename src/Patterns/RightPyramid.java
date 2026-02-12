package Patterns;

public class RightPyramid {
    static void main(String[] args) {
        int n=5;
            for (int i = 0; i <=n ; i++) {
                int j;
                for (j = 0; j < n - i; j++) {
                    System.out.print(" ");
                }
                for(int k=j; k<n;k++){
                    System.out.print("*");

                }
                System.out.println();

        }
    }
}
