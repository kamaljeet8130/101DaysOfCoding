package coding101days.day02;

/**
 * Day 02 — Guess Number Higher or Lower
 * LeetCode #374
 *
 * Pattern: Binary Search on Answer Space
 * Time Complexity: O(log n)
 * Space Complexity: O(1)
 */
public class Day02GuessNumber extends GuessGame {

    public static void main(String[] args) {
        int n = 10;
        System.out.println("The guessed number is: " + new Day02GuessNumber().guessNumber(n));
    }

    /**
     * Finds the correct number using binary search.
     *
     * @param n Upper bound of the guessing range
     * @return Correct guessed number
     */
    public int guessNumber(int n) {
        int start = 0;
        int end = n;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int res = guess(mid);

            if (res == 0) {
                return mid; // Found
            } else if (res < 0) {
                end = mid - 1; // Too high
            } else {
                start = mid + 1; // Too low
            }
        }
        return -1; // Not found
    }
}

class GuessGame {

    // The picked (hidden) number to be guessed
    private int pick = 6; // You can change this value to test different cases

    /**
     * Compares the guessed number with the picked number.
     *
     * @param num Guessed number
     * @return -1 if num > pick, 1 if num < pick, 0 if num == pick
     */
    public int guess(int num) {
        if (num == pick)
            return 0;
        else if (num > pick)
            return -1;
        else
            return 1;
    }
}
