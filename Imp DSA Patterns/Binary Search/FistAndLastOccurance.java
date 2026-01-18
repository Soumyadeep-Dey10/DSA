//https://www.geeksforgeeks.org/problems/first-and-last-occurrences-of-x2041/1
class Solution {
    public ArrayList<Integer> firstAndLast(int x, int arr[]) {
        ArrayList<Integer> list = new ArrayList<>();
        boolean firstOcccurance = true;
        int ans1 = binarySearch(arr,x,true);
        if (ans1 == -1) {
            list.add(-1);
            return list;
        }
        int ans2 = binarySearch(arr,x,false);
        list.add(ans1);
        list.add(ans2);
        return list;   
    }    
        public static int binarySearch(int[] arr,int x,boolean firstOccurance){
            int res = -1;
            int low = 0, high = arr.length-1;
            while(low <= high){
                int mid = high + (low-high)/2;
                if(arr[mid] > x) high = mid-1;
                else if(arr[mid] < x) low = mid+1;
                else{
                    res = mid;
                    if(firstOccurance){
                        high = mid-1;
                    }
                    else{
                        low = mid+1;
                    }
                }
            }
            return res;
        }
       
    
}