//https://www.geeksforgeeks.org/problems/prime-number2314/1
class Solution {
    static boolean isPrime(int n) {
        // code here
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}