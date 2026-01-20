/*

0	
1	1	
2	3	5	
8	13	21	34			
               
*/
public class Main {
    public static void main(String[] args) {
        int a = 0, b = 1;
       
        for(int i = 1; i <= 4; i++){
           
            for(int j = 1; j <= i; j++){
                    System.out.print(a +"\t");
                    int c = a + b;
                    a = b;
                    b = c;
            }
             System.out.println(); 
        }
       
    }
}