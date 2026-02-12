package DSA.Arrays.Searching;

public class BinarySearch {

    public static void searching(int[] arr,int key){

        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==key){
                System.out.println("found");
                return;
            }
            if(key<arr[mid]){
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        System.out.println("not found");
    }

    static void main(String[] args) {
        int[] arr={12,23,45,67,89};
        int key=22;
       searching(arr,key);
    }
}
