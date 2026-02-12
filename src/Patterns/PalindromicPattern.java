package Patterns;

public class PalindromicPattern {
    static void main(String[] args) {


        int n = 5;
//left pattern
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");

            }

                for (int k = i; k >=1 ; k--) {
                    System.out.print(k);


                }
                //right side printing
            for (int j = 2; j <=i ; j++) {
                System.out.print(j);
            }


            System.out.println();
        }

    }
}
