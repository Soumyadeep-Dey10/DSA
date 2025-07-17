// https://www.geeksforgeeks.org/dsa/remove-element/
import java.util.Arrays;

class Main {
    static int removeElement(int[] arr, int ele) {
  
       
        int k = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != ele) {
                arr[k] = arr[i];  
                
                // Increment the count of 
                // elements not equal to ele
                k++;             
            }              
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 3, 0, 2, 2, 4, 2};
        int ele = 2;
        System.out.println(removeElement(arr, ele));
    }
}