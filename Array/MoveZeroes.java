//https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/move-all-zeroes-to-end-of-array0751
package Array;

public class MoveZeroes {

        void pushZerosToEnd(int[] arr) {
            int count = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] != 0){
                    arr[count] = arr[i];
                    count += 1;
                }
            }
            while(count < arr.length){
                arr[count] = 0;
                count++;
            }
        }

}
