package Array;

import java.util.Scanner;

public class SecondMax {
    public static int findSecondMax(int[] arr){
        int max = arr[0];
        int sec_max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                sec_max = max;
                max = arr[i];
            }else if(arr[i] < max && arr[i] > sec_max){
                sec_max = arr[i];
            }
        }
        if(sec_max == Integer.MIN_VALUE){
            System.out.println("No second distinct maximum value.");
            return -1;
        }
        return sec_max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(findSecondMax(arr));
    }
}
