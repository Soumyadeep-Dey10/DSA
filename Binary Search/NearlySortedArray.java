//search in nearly sorted array
class NearlySortedArray{
	public static int searchInNearlySortedArray(int[] arr, int target){
		int low = 0, high = arr.length - 1;
		while(low <= high){
			int mid = low + (high - low)/ 2;
			if(arr[mid] == target) return mid;
			if(mid > low && arr[mid-1] == target) return mid-1;
			if(mid < high && arr[mid+1] == target) return mid+1;

			else if(arr[mid] < target) low = mid+2;
			else high = mid - 2;
		}
	return -1;
	}
	public static void main(String[] args){
		int[] arr = {10, 3, 40, 20, 50, 80, 70};
		int target = 40;
		searchInNearlySortedArray(arr, target);
	}
} 