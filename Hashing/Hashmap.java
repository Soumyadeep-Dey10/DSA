import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int val = sc.nextInt(); // Read the number of key-value pairs
        sc.nextLine(); // Consume the leftover newline

        for (int i = 0; i < val; i++) {
            int key = sc.nextInt(); 
            sc.nextLine(); 
            String value = sc.nextLine(); 
            map.put(key, value);
        }

        // Print stored key-value pairs
        for (int key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
