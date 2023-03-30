package Linearsearch;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][]arr ={
            {2,3,4},
            {4,6,2},
            {8,3,8},
            {3,534,25,2424,3}
        };
        int target = 25;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }
    static int[] search(int[][] arr , int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]== target){
                    return new int[]{row , col};
                }
            }
            
        }
        return new int []{-1,-1} ;
    }
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col]> max){
                    max = arr[row][col];
                }
            }
            
        }
        return max ;
    }
}
