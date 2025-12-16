package coding101days.day38;

/**
 * Day 38 — Move Zeroes
 * LeetCode #283
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Day38MoveZeros {

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 2, 9, 0, 0, 0, 4, 5, 1};
        moveZeroes(arr);
        printArray(arr);
    }

    public static void moveZeroes(int[] arr) {
        int j = 0; // pointer for non-zero elements

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
