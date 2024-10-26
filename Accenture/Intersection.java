package Cheatsheet;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static void find_intersection(int[] arr1, int[] arr2){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : arr1){
            set1.add(i);
        }
        for (int i : arr2){
            if(set1.contains(i)){
                set2.add(i);
            }
        }
        int[] res = new int[set2.size()];
        int i = 0;
        for (int j : set2){
            res[i++] = j;
        }
        for (int index = 0; index < res.length; index++){
            System.out.println(res[index]);
        }
    }
    public static void main(String[] args) {
        int[] array3 = {4, 9, 5};
        int[] array4 = {9, 4, 9, 8, 4};
        find_intersection(array4,array3);
    }
}
