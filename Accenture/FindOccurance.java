package Cheatsheet;

//The function accepts two strings ‘str1ʼ and ‘str2ʼ as its argument. The function
//needs to return the index of the first occurrence of substring ‘str2ʼ in string
//‘str1ʼ or 1 if the substring is not found.
// Input:
// str1 “Hello, World!ˮ
// str2 “Worldˮ

import java.util.Scanner;

public class FindOccurance {
    public static void main(String[] args) {
        String str1 = "Hello, World!";
        String str2 = "World";
        System.out.println(str1.indexOf(str2));
    }
}
