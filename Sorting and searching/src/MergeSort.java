import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        arr = mergeSort(arr);  // Update arr with the sorted array
        System.out.println(Arrays.toString(arr));  // Print the sorted array
    }

    // Merge function to merge two sorted arrays
    public static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;

        // Merge the two arrays
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // If there are remaining elements in the first array, add them
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        // If there are remaining elements in the second array, add them
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }

    // Merge sort function to divide the array and recursively sort
    public static int[] mergeSort(int[] arr) {
        // Base case: if the array has only one element, it's already sorted
        if (arr.length == 1) {
            return arr;
        }

        // Split the array into two halves
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));  // Left half
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));  // Right half

        // Merge the sorted halves and return the sorted array
        return merge(left, right);
    }
}
