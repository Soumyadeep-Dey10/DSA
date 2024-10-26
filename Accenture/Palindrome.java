package Cheatsheet;

public class Palindrome {
    public static boolean check_palindrome(String str){
       int i = 0 , j = str.length()-1;
       String str2 = str.toLowerCase();
       while (i < j){
           if (str2.charAt(i) != str2.charAt(j)){
               return false;
           }
           i++;
           j--;
       }
       return true;
    }
    public static void main(String[] args) {
        System.out.println(check_palindrome("Madam"));
    }
}
