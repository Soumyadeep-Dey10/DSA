package Cheatsheet;

public class DifferenceOfSum {
    public static int sumDiffernce(int m, int n){
       int sum = 0, sum2 = 0;
       for (int i = 1; i <= n; i++){
           if(i % m != 0){
               sum += i;
           }else{
               sum2 += i;
           }
       }

       return sum - sum2;
    }
    public static void main(String[] args) {
        System.out.println(sumDiffernce(3, 10));
    }
}
