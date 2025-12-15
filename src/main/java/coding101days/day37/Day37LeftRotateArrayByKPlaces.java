package coding101days.day37;

/**
 * Day 37 — Left Rotate Array by K Places
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Day37LeftRotateArrayByKPlaces {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 10;

        k = k % arr.length; // handle k > n
        leftRotateByK(arr, k);
        printArray(arr);
    }

    public static void leftRotateByK(int[] arr, int k) {
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    private static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
