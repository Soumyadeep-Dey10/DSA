package Cheatsheet;

public class GooglyPrime {
    //43, 4 + 3 = 7 == prime, :: googly prime
    public  static boolean checkGoogly(int num){
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num %2 == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 121;
        int sum = 0;
        while (num > 0){
            int rem = num % 10;
            sum = sum + rem;
            num /= 10;
        }
        System.out.println(checkGoogly(sum));
    }
}
