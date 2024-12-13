//https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?page=1&category=Arrays&sortBy=submissions
package Array;
import java.util.*;
public class ArrayLeaders {

        static ArrayList<Integer> leaders(int arr[]) {
            ArrayList<Integer> list = new ArrayList<>();

            list.add(arr[arr.length - 1]);

            int leader = arr[arr.length -1];

            for(int i = arr.length - 2; i >= 0; i--){
                if(arr[i] >= leader){
                    leader = arr[i];
                    list.add(arr[i]);
                }
            }
            Collections.sort(list, Collections.reverseOrder());
            return list;
        }

}
