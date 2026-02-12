package Patterns;

public class NumberPyramid {
    static void main(String[] args) {
        int n=5;

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <=n-i ; k++) {
                System.out.print(" ");

            }
            for (int j =1; j <=i ; j++) {
//                System.out.print(i+" "); // un comment this line for proper visual of output and comment the  line14
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
