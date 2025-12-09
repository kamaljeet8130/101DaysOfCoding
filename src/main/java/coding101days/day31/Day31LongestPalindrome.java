package coding101days.day31;

import java.util.HashMap;

public class Day31LongestPalindrome {

    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s)); // Output: 7
    }

    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int length = 0;
        boolean oddFound = false;

        for (int freq : map.values()) {
            if (freq % 2 == 0) {
                length += freq;
            } else {
                length += freq - 1; // use largest even part
                oddFound = true;
            }
        }

        // If any odd freq exists, we can put exactly 1 char in the center
        return oddFound ? length + 1 : length;
    }
}
