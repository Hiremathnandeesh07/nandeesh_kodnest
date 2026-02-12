package DSA.Arrays.Searching;

public class LinearSearch {
    static void main(String[] args) {
        int[] arr={34,5,6,8,22,54,8,854};
        int SearchEle= 22;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==SearchEle){
                System.out.println("found");
                return;
            }
        }
        System.out.println("not found");
        return;
    }
}
