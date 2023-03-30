package Linearsearch;

public class Maxwealth {
    public static void main(String[] args) {
        int[][] arr= {
            {12,3,4},
            {13,24,13},
            {34,345,65}
        };
        System.out.println(maxWealth(arr));
    }
    public static int maxWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum= 0;
            for (int account = 0; account < accounts[person].length; account++) {
                 sum += accounts[person][account];
            }
            if(sum> ans){
                ans= sum;
            }
        }
        return ans;
    }
}
