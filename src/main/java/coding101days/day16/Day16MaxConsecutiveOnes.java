package coding101days.day16;

/**
 * Day 16 — Max Consecutive Ones
 * LeetCode #485
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Day16MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    public static int findMaxConsecutiveOnes(int[] arr) {
        int count = 0;
        int maxCount = 0;

        for (int x : arr) {
            if (x == 1) {
                count++;
            } else {
                count = 0;
            }
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}
