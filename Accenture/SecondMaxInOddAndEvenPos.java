package Cheatsheet;

//The function takes an integral arr which is of the size or length of its
//arguments. Return the sum of the second smallest element at odd position
//‘arr’ and the second largest element at the even position

import java.util.Arrays;

public class SecondMaxInOddAndEvenPos {
    public static void largeSmallSum(int[] arr){

        int maxodd = Integer.MIN_VALUE, secondmaxodd = Integer.MIN_VALUE;
        int maxeven = Integer.MIN_VALUE, secondmaxeven = Integer.MIN_VALUE;

        //check even position
        for(int i = 0; i < arr.length; i = i + 2){
            if(arr[i] > maxeven){
                secondmaxeven = maxeven;
                maxeven = arr[i];
            }
            else if(arr[i] > secondmaxeven && arr[i] < maxeven){
                secondmaxeven = arr[i];
            }
        }

        //check odd position
        for(int i = 1; i < arr.length; i = i + 2){
            if(arr[i] > maxodd){
                secondmaxodd = maxodd;
                maxodd = arr[i];
            }
            else if(arr[i] > secondmaxodd && arr[i] < maxodd){
                secondmaxodd = arr[i];
            }
        }
        System.out.println(secondmaxeven+secondmaxodd);
    }

//    Given an array A of length N and we have to find the sum of even positions
//    after reversing
//    the array, Your task is to help him find and retum an integer value
//    representing sum of the
//    array elements present at the even positions of the reversed array.

    public static int calculate(int[] arr){
        int[] rev = new int[arr.length];
        int sum = 0, j = 0;
        for (int i = arr.length - 1; i >= 0; i--){
            rev[j++] = arr[i];
        }
        System.out.println(Arrays.toString(rev));
        for (int i = 0; i < rev.length; i = i + 2){
            sum += rev[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arrr  = { 3, 2, 1, 7, 5, 4,0};
        System.out.println(calculate(arrr));
    }
}
