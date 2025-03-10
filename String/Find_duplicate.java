import java.util.*;
class Find_duplicate{
	public String printDuplicate(String str){
		StringBuilder sb = new StringBuilder();
		HashMap<Character, Integer> map = new HashMap<>();
		for(char ch : str.toCharArray()){
			map.put(ch, map.getOrDefault(ch, 0) +1);
		}
		for(char ch : map.keySet()){
			if(map.get(ch) > 1){
				sb.append(ch);
			}
		}
		return sb.toString();
	}  
	public static void main(String[] args){
		Find_duplicate ob = new Find_duplicate();
		System.out.println(ob.printDuplicate("Hello World Wood"));
	}
}