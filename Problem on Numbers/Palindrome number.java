//https://www.geeksforgeeks.org/problems/palindrome0746/1
class Solution {
    public boolean isPalindrome(int n) {
        int sum = 0;
        int number = n;
        
        while(number > 0){
            int rem = number % 10;
            sum = (sum * 10) + rem;
            number /= 10;
        }
        return n == sum;
    }
}