package Cheatsheet;

public class CharReplace {
    public static String replace(String str, char ch1, char ch2){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ch1){
                sb.append(ch2);
            }
            else if(ch == ch2){
                sb.append(ch1);
            }
            else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(replace("apples", 'a', 'p'));
    }
}
