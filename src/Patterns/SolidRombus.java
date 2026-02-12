package Patterns;

public class SolidRombus {
    public static void main() {
        int n=5;

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <=n-i ; k++) {
                System.out.print(" ");

            }

            for(int j=1;j<=n;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
