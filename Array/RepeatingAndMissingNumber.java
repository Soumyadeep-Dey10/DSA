//https://www.geeksforgeeks.org/problems/find-missing-and-repeating2512/1
class Solution {
    // Function to find the repeating and missing elements
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] check = new boolean[n + 1];

        int repeating = -1, missing = -1;

        // Find repeating number
        for (int i = 0; i < n; i++) {
            if (check[arr[i]]) {
                repeating = arr[i];
            } else {
                check[arr[i]] = true;
            }
        }

        // Find missing number
        for (int i = 1; i <= n; i++) {
            if (!check[i]) {
                missing = i;
                break;
            }
        }

        list.add(repeating);
        list.add(missing);
        return list;
    }
}