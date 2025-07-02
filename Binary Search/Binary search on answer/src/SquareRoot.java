//Find the square root of a number using binary search
//A number int n will be given, find the square root of the number or ceil of the square root
//If n = 28, op will be 5 and if n = 36 op will be 6

public class SquareRoot {
    public static int findSquareroot(int n){
        int low = 1, high = n;
        while (low <= high){
            int mid = low + (high - low)/2;

//            if ( (mid * mid) == n ) return mid;
            if (mid * mid <= n){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return high;
    }
    public static void main(String[] args) {

        System.out.println(findSquareroot(25));
    }
}
