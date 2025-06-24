class AbsoluteDifference{
	public static int getDifference(int[] arr, int target){
		int low = 0, high = arr.length - 1;
		while(low <= high){
			int mid = low + (high- low) / 2;
			if(arr[mid] == target) return 0;
			else if(arr[mid] < target) low = mid + 1;
			else high = mid- 1; 
		}
		return Math.min(Math.abs(arr[low] - target), Math.abs(arr[high] - target));
	}
	public static void main(String[] args){
		int[] arr = {1,3,8,10,15};
		int target = 12;
		System.out.println(getDifference(arr, target));
	}
}