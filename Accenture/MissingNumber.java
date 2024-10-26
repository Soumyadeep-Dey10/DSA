package Cheatsheet;

public class MissingNumber {
    public static  int findMissing(int[] arr){
        int n = arr.length ;
        int expected = (n * (n + 1)) /2;
        int total = 0;
        for(int i = 0; i < arr.length; i++){
            total += arr[i];
        }
        return expected - total;
    }
    public static void main(String[] args) {
        int[] arr = { 3,0,1};
        System.out.println(findMissing(arr));
    }
}
