package Cheatsheet;

public class ReverseString {
    public static String reverseWords(String str){
        if(str == "") return str;
//        String str1 = "";
//        for(int i = str.length()-1; i >= 0; i--){
//            str1 += str.charAt(i);
//        }
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
    //"Hello World from ChatGPT"; o/p: "ChatGPT from World Hello"
    public static String reverse(String str){
        StringBuilder sb = new StringBuilder();
        String[] str1 = str.split(" ");

        for (int i = str1.length-1; i >= 0; i--){
            sb.append(str1[i]);
            if(i != 0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(reverse("Hello world"));
    }
}
