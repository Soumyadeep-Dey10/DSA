//https://www.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1
public class Subsetsum {
    
    static Boolean isSubsetSum(int arr[], int target) {
        int n = arr.length;
        boolean[][] t = new boolean[n+1][target+1];
        
        for(int i = 0; i < n+1; i++){
            for(int j = 0; j < target+1; j++){
                if(i == 0){
                    t[i][0] = false;
                }
                else if(j == 0){
                    t[0][j] = true;
                }
            }
        }
        
        for(int i = 1; i < n+1; i++){
            for(int j = 1; j< target+1; j++){
                if(arr[i-1] <= j){
                    t[i][j] = t[i-1][j - arr[i-1]] || t[i-1][j];
                }
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][target];
    }
 public static void main(String[] args) {
    
 }   
}

