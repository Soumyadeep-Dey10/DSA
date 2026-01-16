/*
                *	
			*		
		*			
	*				
*		
               
*/
public class Main {
    public static void main(String[] args) {
        
       
        for(int i = 5; i >= 1; i--){
           
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