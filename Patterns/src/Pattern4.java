import java.util.Scanner;

*	*	*	*	*	
	*	*	*	*	
		*	*	*	
			*	*	
				*
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
    //approach 2
    public static void main(String[] args) {
        int sp = 0, st = 5;
        for(int i = 1; i <= 5; i++){
            for(int k = 1; k <= sp; k++){
                System.out.print("\t");
            }
            for(int j = 1; j <= st; j++){
                System.out.print("*\t");
            }
             System.out.println();
             sp++;
             st--;
        }
       
    }
}

