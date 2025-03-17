// Write a program that takes two integers, N and M (N ≤ M), as input and calculates the sum of cubes of all numbers in the range [N, M].
import java.util.Scanner;
public class Main {
    public static int calculateCubeSum(int N, int M){
        if(N > M){
            N = N + M;
            M = N - M;
            N = N - M;
        }
        int sum = 0;
        for(int i = N; i <= M; i++){
            sum +=(long) Math.pow(i, 3);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        System.out.println(calculateCubeSum(N,M));
    }
}