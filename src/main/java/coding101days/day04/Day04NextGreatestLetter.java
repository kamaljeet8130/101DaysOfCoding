package coding101days.day04;

/**
 * Day 04 — Find Smallest Letter Greater Than Target
 * LeetCode #744
 *
 * Pattern: Binary Search — Lower Bound
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class Day04NextGreatestLetter {

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';

        char result = nextGreatestLetter(letters, target);
        System.out.println("The smallest letter greater than '" + target + "' is: " + result);
    }

    /**
     * Finds the smallest letter in the sorted array that is greater than the target.
     * Letters wrap around — so if target is greater than or equal to the last letter,
     * the function returns the first letter in the array.
     *
     * @param letters Sorted array of lowercase letters
     * @param target  The target letter
     * @return The smallest letter greater than the target (wraps if necessary)
     */
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        char ans = letters[0]; // default wrap-around

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] > target) {
                ans = letters[mid];
                end = mid - 1; // move left to find smaller valid answer
            } else {
                start = mid + 1; // move right
            }
        }
        return ans;
    }
}
