package Linearsearch;

public class Linersearch {
    public static void main(String[] args) {
        int[] nums = {};
        int target = 0;
        int ans = Linearsearch(nums,target);
        
        System.out.println(ans);
    }

    
    static int Linearsearch(int[] arr,int target){
        if (arr.length == 0){
            return 69;
        }
        for (int index = 0; index<arr.length ; index++){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
