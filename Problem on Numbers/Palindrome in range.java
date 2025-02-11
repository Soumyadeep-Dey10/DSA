//https://www.geeksforgeeks.org/problems/generate-all-palindromic-numbers-less-than-n3251/1
class Solution{
   static int palindromicNumbers(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {  // Now this loop goes up to n-1
            if (isPalindrome(i)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPalindrome(int n) {
        int sum = 0;
        int number = n;

        while (number > 0) {
            int rem = number % 10;
            sum = (sum * 10) + rem;
            number /= 10;
        }

        return n == sum;
    }
}