package Cheatsheet;

public class Maximum_Element {
    public static int[] find_maxElement(int[] arr){
        int max = arr[0], index = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                index = i;
            }
        }
        return new int[]{max, index};
    }
    public static int  find_secondmaxElement(int[] arr){

        if(arr.length < 2){
            throw  new IllegalArgumentException("Array must contain 2 element");
        }
        int max = Integer.MIN_VALUE;
        int second_max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max ){
                second_max = max;
                max = arr[i];
            }else if(arr[i] > second_max && arr[i] < max ){
                second_max = arr[i];
            }
        }
        if(second_max == Integer.MIN_VALUE){
            throw new IllegalArgumentException("Same number");
        }
        return second_max;
    }
    public static int find_secondminElement(int[] arr){
        int min = Integer.MAX_VALUE;
        int sec_min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                sec_min = min;
                min = arr[i];
            }
            else if(arr[i] < sec_min && arr[i] > min){
                sec_min = arr[i];
            }
        }
        if (sec_min == Integer.MAX_VALUE || sec_min == min) {
            return -1;
        }

        return sec_min;
    }
    public static void main(String[] args) {
//        int[] arr = {15, 78, 96, 17, 20, 65, 14, 36, 18, 20};
//        int[] res = find_maxElement(arr);
////        System.out.println(find_maxElement(arr));
////        System.out.println("Maximum element:"+res[0]);
////        System.out.println("Index is:"+res[1]);
//        System.out.println(find_secondminElement(arr));

            System.out.println(find_secondminElement(new int[]{})); // -1
            System.out.println(find_secondminElement(new int[]{5})); // -1
            System.out.println(find_secondminElement(new int[]{1, 1, 1})); // -1
            System.out.println(find_secondminElement(new int[]{2, 3})); // 3
            System.out.println(find_secondminElement(new int[]{3, 2})); // 3
            System.out.println(find_secondminElement(new int[]{-1, -2, -3, 0, 1})); // -1
            System.out.println(find_secondminElement(new int[]{-1, -1, -2})); // -1
            System.out.println(find_secondminElement(new int[]{1, 2, 3, 4, 5})); // 2
            System.out.println(find_secondminElement(new int[]{10, 20, 30, 10, 20})); // 20


    }
}
