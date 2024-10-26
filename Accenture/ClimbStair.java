package Cheatsheet;

public class ClimbStair {
    public static int found(int n){
        int a = 1, b = 1;
        for (int i = 2; i <= n; i++){
            int c = a + b;
           b = a;
           a = c;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(found(2));
    }
}
