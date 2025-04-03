// "static void main" must be defined in a public class.
public class Main {
    public static void pattern1(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                 System.out.print("*");
            }
            System.out.println();
        }
    }
/*
*****
****
***
**
*
*/
    public static void pattern2(int n){
        for(int i = 5; i >= 0; i--){
            for(int j = 0; j < i; j++){
                 System.out.print("*");
            }
            System.out.println();
        }
    }
    
/*
    *
   **
  ***
 ****
*****
*/  
    public static void pattern3(int n){
        for(int i = 1; i <= n; i++){
            for(int k = n-i; k > 0; k--){
                System.out.print(" ");
            }
            // for(int k = i; k < n; k++){
            //     System.out.print(" ");
            // }
            for(int j = 0; j < i; j++){
                 System.out.print("*");
            }
            System.out.println();
        }
    }
/*      
*****
 ****
  ***
   **
    *
*/ 
 public static void pattern4(int n){
        for(int i = 5; i >= 1; i--){
            for(int k = n-i; k > 0; k--){
                System.out.print(" ");
            }
            
            for(int j = i; j > 0; j--){
                 System.out.print("*");
            }
            System.out.println();
        }
    }
/*   
*****
*****
*****
*****
*****    
*/
public static void pattern5(int n){
        for(int i = n; i >= 1; i--){
            for(int j = n; j > 0; j--){
                 System.out.print("*");
            }
            System.out.println();
        }
    }
 /*
*****
*   *
*   *
*   *
*****
 */
    public static void pattern6(int n){
        for(int i = n; i >= 1; i--){
            for(int j = n; j > 0; j--){
                if(i == 1 || i == 5 || j == 1|| j == 5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) {
        pattern6(5);
    }
}
