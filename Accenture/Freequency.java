package Cheatsheet;

import java.util.HashMap;

public class Freequency {
    public static void findFreequency(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i  : arr){
            map.put(i,(map.getOrDefault(i, 0) +1));
        }

        for (Integer key : map.keySet()){
            System.out.println(key+" occured"+map.get(key));
        }
    }

    //find frequency of a particular element
    public static int check(String str, char target){
        int count = 0;
        for (char ch : str.toCharArray()){
            if (ch == target) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr= {5, 2, 4, 1, 2};
        String str = "Hello worldh";
        System.out.println(check(str, 'h'));
    }
}
