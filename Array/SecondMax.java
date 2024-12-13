package Array;

//https://www.geeksforgeeks.org/problems/second-largest3735/1?page=1&category=Arrays&sortBy=submissions
public class SecondMax {


        public int getSecondLargest(int[] arr) {
            int max = Integer.MIN_VALUE;
            int smax = Integer.MIN_VALUE;
            for(int i = 0; i < arr.length; i++){
                if(arr[i] > max){
                    smax = max;
                    max = arr[i];
                }
                else if(arr[i] > smax && arr[i] < max){
                    smax = arr[i];
                }
            }

            if(smax == Integer.MIN_VALUE) return -1;

            return smax;
        }

}
