package BinarySearch;

public class OrderAgnosticsBS {
    public static void main(String[] args) {
        int [] arr = {9,8,7,6,5,4,3,1,};
        int target = 4;
        int ans = oabs(arr , target);
        System.out.println(ans);
    }
    static int oabs(int [] arr, int target){
        int start = 0;
        int end = arr.length -1 ;
        //find the order of the array asscending or decending
        boolean isAsc = arr[start]<arr[end];
        
        while (start <= end) {
            // find the middle element
            //int mid = ( start + end ) / 2; // might be pssosnle that (start + int ) exceeds the range of int in java
            int mid = start + (end- start) / 2;

            if(arr[mid]== target){
                return mid;

            }   if(isAsc) {
                if(target < arr[mid]){
                    end = mid -1;
                }else {
                    start= mid + 1;
                } 

            }else{
                if (target > arr[mid]){
                    end = mid -1;
                }else {
                    start= mid + 1;
                }
            }
          
        }
        return -1;
    }
}
