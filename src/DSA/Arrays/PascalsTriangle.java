package DSA.Arrays;

import java.util.ArrayList;

public class PascalsTriangle {

//   static int findncr(int n, int r){
//       int res=1;
//       for (int i = 0; i < r; i++) {
//           res=res*(n-i);
//           res=res/(i+1);
//       }
//
//       return res;
//   }

//   static void findNthRow(int c){
//       for (int i = 0; i <=c; i++) {
//           System.out.println(findncr(c,i));
//       }
//
//   }

//    static void findNthRow(int n){
//        long ans = 1;
//        System.out.print(ans + " ");
//
//        for (int i = 1; i <= n; i++) {
//            ans = ans * (n - i + 1);
//            ans = ans / i;
//            System.out.print(ans + " ");
//        }
//        System.out.println();
//    }

     public static ArrayList<Integer> generaterow(int row) {
        int ans=1;
        var ansrow=new ArrayList<Integer>();
        ansrow.add(1);
        for (int col = 1; col < row; col++) {
            ans=ans*(row-col);
            ans=ans/col;
            ansrow.add(ans);


        }
        return ansrow;
    }



    public static void main(String[] args) {
       int Rows=5;
        ArrayList<ArrayList<Integer>> triangle=new ArrayList<>();
        for (int i = 1; i <= Rows; i++) {
            triangle.add(generaterow(i));

        }

        for (ArrayList<Integer> integers : triangle) {
            System.out.println(integers.toString());
        }



    }


}
