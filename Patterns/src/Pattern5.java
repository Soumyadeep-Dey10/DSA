import java.util.Scanner;

//  *
// ***
//*****
// ***
//  *

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st = 1, sp = n / 2;

        for(int i = 1; i <= n; i++){
            for (int j = 1; j <= sp; j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= st; j++){
                System.out.print("*");
            }

            if(i <= n / 2){
                st += 2;
                sp -= 1;
            }
            else {
                sp += 1;
                st -= 2;
            }
            System.out.println();
        }
    }
}
