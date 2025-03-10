import java.util.*;
class Remove_vowels{
	public static void main(String[] args){
		String ans = "";
		Scanner sc = new Scanner(System.in);
		String str = new String(sc.nextLine());
		str = str.toLowerCase();
		for(char ch : str.toCharArray()){
			if(ch != 'i' && ch != 'o' && ch != 'a' && ch != 'e' && ch != 'u'){
				ans += ch;				
}
		
}
		System.out.println(ans);
}
}