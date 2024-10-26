package Cheatsheet;

import java.util.Arrays;

public class Anagram {
    public static boolean checkAnagram(String str1, String str2){
        if(str1.length() != str2.length()) return false;

        String str3 = str1.toLowerCase();
        String str4 = str2.toLowerCase();

        char[] arr1 = str3.toCharArray();
        char[] arr2 = str4.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
    public static void main(String[] args) {
        boolean res = checkAnagram("Listen", "silent");
        if(res){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
