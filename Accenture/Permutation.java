package Cheatsheet;

//You are given a string S and your task is to find and return the count of
//permutation formed
// by fixing the positions of the vowels present in the string.
// Note:
//  Ensure the result is non-negative
//  If there are no consonants then return O.
public class Permutation {
    public static int countFactorial(int num){
        int count = 1;
        if(num == 0 || num == 1) return 1;
        while (num > 0){
            count = count * num;
            num--;
        }
        return count;
    }
    public static int countConsonant(String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' && Character.isLetter(ch)) count+=1;
        }
        return countFactorial(count);
    }

    public static void main(String[] args) {
        System.out.println(countConsonant("sdeep"));
    }
}
