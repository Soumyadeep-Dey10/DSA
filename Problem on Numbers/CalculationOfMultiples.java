//Write a program that takes an integer N as input and calculates the sum of the first N multiples of 10.
import java.util.Scanner;
public class Main {
  public static int calculateSumOfMultiples(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i * 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(calculateSumOfMultiples(N));
    }
}