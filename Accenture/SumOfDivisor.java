package Cheatsheet;

public class SumOfDivisor {
    public static int findSum(int n){
        int i = 1, sum = 0;
        for( i = 1; i <= n; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(findSum(6));
    }
}
