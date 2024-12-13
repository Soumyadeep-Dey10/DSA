//https://www.geeksforgeeks.org/problems/find-duplicates-in-an-array/1?page=1&category=Arrays&sortBy=submissions

package Array;
import java.util.*;


public class ArrayDuplicate {


        public static List<Integer> findDuplicates(int[] arr) {
            ArrayList<Integer> list = new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();

            for(int value : arr){
                map.put(value, map.getOrDefault(value, 0) +1);
            }

            for(int key : map.keySet()){
                if(map.get(key) > 1){
                    list.add(key);
                }
            }
            Collections.sort(list);
            return list;

    }

    public static void main(String[] args) {
            int[] arr = {2,3,1,2,3};
            System.out.println(findDuplicates(arr));
    }
}
