package Cheatsheet;

public class HappyNumber {
    public static boolean isHappty(int n){
        int fast = n, slow = n;
        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while (slow != fast);
        return slow == 1;
    }
    public static  int findSquare(int num){
        int sum = 0;
        while (num > 0) {
            int digit = num % 10; // Get last digit
            sum += digit * digit; // Add square of the digit
            num /= 10; // Remove last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isHappty(2));
    }
}
