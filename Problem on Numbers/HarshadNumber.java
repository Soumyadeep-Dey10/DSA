//https://www.tpointtech.com/program-to-check-harshad-number
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n,sum = 0;
        while(num > 0){
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        if(n % sum == 0){
            System.out.println("Harshad Number");
        }
        else{
            System.out.println("Not Harshad Number");
        }
    }
}