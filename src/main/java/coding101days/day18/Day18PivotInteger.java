package coding101days.day18;

/**
 * Day 18 — Find the Pivot Integer
 * LeetCode #2485
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Day18PivotInteger {

    public static void main(String[] args) {
        System.out.println(pivotInteger(8)); // Example
    }

    public static int pivotInteger(int n) {
        int totalSum = (n * (n + 1)) / 2;
        int leftSum = 0;

        for (int i = 1; i <= n; i++) {
            leftSum += i;
            int rightSum = totalSum - leftSum + i;

            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}
