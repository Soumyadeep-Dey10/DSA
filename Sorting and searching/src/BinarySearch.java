public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {-7,4,5,8,7,15};
        System.out.println(bSearch(arr,-7));
    }
    public static int bSearch(int[] arr,int target){
        int low = 0, high = arr.length-1;
        while (low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) low = mid+1;
            else high = mid - 1;
        }
        return -1;
    }
}
