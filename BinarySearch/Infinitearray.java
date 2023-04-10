package BinarySearch;

public class Infinitearray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,14,15,16,17,45,56,67,78,98,100};
        int target = 56 ;
        System.out.println(findingRange(arr,target));
    }
    static int findingRange(int [] arr,int target){
        //first find the range 
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        //target should be in range of start and end 
        while (target > arr[end]) {
            int newStart= end+1;
            //double the box value
            // end = previous end + sizeofbox*2
            end = end + (end - start +1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr , int target,int start , int end){

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