package Linearsearch;

public class even {
    public static void main(String[] args) {
        int[] nums ={1287,2324,2,4,21324};
        System.out.println(digit2(523334));
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int num:nums) {
            if (even2(num)){
                count++;
            }    
        }

        return count;
    }static boolean even2(int num){
    int numberofdigits = digits(num);
    if (numberofdigits % 2==0) {
        return true;
    }
    return false;  
    }
    static int digits(int num){
        if (num< 0) {
            num = num * -1;
        }
        if (num==0){
            return 1;
        }
        int count = 0;
        while (num>0) {
            count++;
            num = num/10;
            
        }
        return count;
    }
    static int digit2(int num){
        return (int)(Math.log10(num))+1;
    }
}
