/*Question:
 John has discovered a magical tree, where each new branch grows following a unique pattern.
 Unlike the traditional Fibonacci sequence, the number of branches at each stage follows this
 rule:
 Stage 1: 1 branch
 Stage 2: 2 branches
 From Stage 3 onwards: The branches at each stage are the product of the previous two
 stages multiplied by 2.
*/
import java.util.Scanner;
public class Main {
    public static int count(int n){
        if(n == 1) return 1;
        if(n == 2) return 3;
        int num1 = 1, num2 = 2, sum = 3;
        for(int i = 3; i <= n; i++){
            int current = num1 * num2 * 2;
            sum += current;
            num1 = num2;
            num2 = current;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));
    }
}