package Cheatsheet;

import java.util.Scanner;

public class CharityProblem {
    public static int findCharity(int x){
        int total = 1;
        for (int i = 1; i <= x; i++){
            total = i * i;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(findCharity(x));
    }
}
