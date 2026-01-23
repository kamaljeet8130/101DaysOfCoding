package coding101days.day74;

/**
 * Day 74 — Longest Repeating Character Replacement
 * LeetCode #424
 *
 * Pattern: Sliding Window + Frequency Array
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Day74LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {
        System.out.println(characterReplacement("AABABBA", 1));
    }

    public static int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0, maxFreq = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            freq[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            while ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
