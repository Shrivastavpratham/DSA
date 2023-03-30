package Linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18,12,32,43,13,231};
        int target = 12;
        System.out.println(searchInRange( arr ,target , 1 , 4));
    }
      static int searchInRange(int[] arr,int target, int start , int end){
        if (arr.length == 0){
            return 69;
        }
        for (int index = start; index<= end ; index++){
            int element = arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
