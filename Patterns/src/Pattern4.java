import java.util.Scanner;

//*****
// ****
//  ***
//   **
//    *
public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n :");
        int n = sc.nextInt();

        for (int i = 5; i >= 1; i--){
            for (int k = 1; k <= n - i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
