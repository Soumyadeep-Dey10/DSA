import java.util.*;

class Sort_string {
    public static void main(String[] args) {
        String str = "Hello my name is Soumyadeep";

        // Remove spaces before sorting
        char[] arr = str.replaceAll(" ", "").toCharArray();
        Arrays.sort(arr);

        System.out.println(new String(arr)); // Convert back to a string
    }
}
