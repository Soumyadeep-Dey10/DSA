package Cheatsheet;

public class Fibonacci {
    //recurrence relation
    //f(N)=f(N−1)×f(N−1)+f(N−2)×f(N−2)
    public static int calculate(int n){
        if(n == 0 || n == 1)return 1;
        int[] res = new int[n+1];
        res[0] = 1;
        res[1] = 1;
        for (int i = 2; i <= n; i++) {
            res[i] = (res[i - 1] * res[i - 1]) + (res[i - 2] * res[i - 2]);
        }
        return res[n];
    }
    public static void main(String[] args) {
        System.out.println(calculate(4));
    }
}
