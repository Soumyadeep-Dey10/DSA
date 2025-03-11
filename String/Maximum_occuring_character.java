class Maximum_occuring_character{
	public static char find(String str){
		int[] arr = new int[256];
		for(char ch : str.toCharArray()){
			arr[ch]++;
		}
		char ans = str.charAt(0);
		int maxCount = 0;
		for(char ch : str.toCharArray()){
			if(arr[ch] > maxCount){
				maxCount = arr[ch];			
				ans = ch;
			}
		}
	return ans;
	}
	public static void main(String[] args){
		System.out.println(find("Helloooo world"));	
	}
}