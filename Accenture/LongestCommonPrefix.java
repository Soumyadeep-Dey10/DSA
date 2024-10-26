package Cheatsheet;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String find(String[] str){
        Arrays.sort(str);
        String str1 = str[0];
        String str2 = str[str.length - 1];
        int count = 0, i  = 0;
        while (i < str1.length() && i < str2.length() && str1.charAt(i) == str2.charAt(i)){
            i++;
        }
        return str1.substring(0, i);
    }

    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.println(find(str));
    }
}
