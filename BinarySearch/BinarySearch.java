package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr= {8,7,6,5,4,3,2,1};
        int target = 1;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length -1 ;

        while (start <= end) {
            // find the middle element
            //int mid = ( start + end ) / 2; // might be pssosnle that (start + int ) exceeds the range of int in java
            int mid = start + (end- start) / 2;

            if (target < arr[mid]){
            //if (target > arr[mid]) for decending order  
                end = mid -1;
            }else if (target > arr[mid]){
            //else if (target < arr[mid]) for decending order 
                start= mid + 1;
            } else {
                return mid ;
            }
        }
        return -1;

    }
}
