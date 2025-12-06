package coding101days.day28;

/**
 * Day 28 — Selection Sort
 *
 * Time Complexity: O(n²)
 * Space Complexity: O(1)
 */
public class Day28SelectionSort {

    public static void main(String[] args) {
        int[] arr = generateArray(100);
        selectionSort(arr);
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = minValueIndex(arr, i);
            swap(arr, minIndex, i);
        }

        for (int val : arr) {
            System.out.print(val + ", ");
        }
    }

    public static int minValueIndex(int[] arr, int start) {
        int minIndex = start;
        for (int i = start; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int[] generateArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }
        return arr;
    }
}
