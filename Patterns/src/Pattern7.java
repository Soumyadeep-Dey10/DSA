// "static void main" must be defined in a public class.

/*
*	
	*	
		*	
			*	
				*
*/

public class Main {
    public static void main(String[] args) {
        int sp = 2, st = 1;
        for(int i = 1; i <= 5; i++){
            for(int k = 1; k < i; k++){
                System.out.print("\t");
            }
            for(int j = 1; j <= i; j++){
                if(i == j){
                    System.out.print("*\t");
                }
                
            }
             System.out.println(); 
        }
       
    }
	//apprach 2
	public static void main(String[] args) {
        
        for(int i = 1; i <= 5; i++){
           
            for(int j = 1; j <= 5; j++){
                if(i == j){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
             System.out.println(); 
        }
       
    }

}