package BinarySearch;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans= ceilingOfANumber(arr, target);
        System.out.println(ans);

    }
    static int ceilingOfANumber(int[] arr , int target){
            if (target >arr[arr.length-1]) {
                return -1;
            }
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
        return start;// for ceiling value
        //ceiling value = smallest no>= target
        //return end; for floor value
        //floor value = greatest number <= target 
    }
}

