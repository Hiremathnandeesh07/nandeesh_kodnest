package Patterns;

public class DiamondPattern {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");

            }
            for (int j = 0; j < i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();


        }

        for (int i = n; i >=1; i--) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");

            }
            for (int j = 0; j < i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();


        }
    }
}
