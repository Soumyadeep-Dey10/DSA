// "static void main" must be defined in a public class.
					*	
				*	*	
			*	*	*	
		*	*	*	*	
	*	*	*	*	*	
public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            for(int k = 5-i; k >= 0; k--){
                System.out.print("\t");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*\t");
            }
             System.out.println();
        }
       
    }
    //second approach
    public static void main(String[] args) {
        int sp = 4, st = 1;
        for(int i = 1; i <= 5; i++){
            for(int k = 1; k <= sp; k++){
                System.out.print("\t");
            }
            for(int j = 1; j <= st; j++){
                System.out.print("*\t");
            }
             System.out.println();
             sp--;
             st++;
        }
}
