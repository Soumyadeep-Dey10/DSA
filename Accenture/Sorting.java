package Cheatsheet;

public class Sorting {
    public static int selectionSort(int[] arr) {
        int swapCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j; // Update min_index if a smaller element is found
                }
            }
            if (min_index != i) {
                // Swap elements if a smaller element is found
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
                swapCount++; // Increment swap count
            }
        }
        return swapCount; // Return total swaps made
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        int swapCount = selectionSort(arr);

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Print the number of swaps
        System.out.println("\nNumber of swaps required: " + swapCount);
    }
}
