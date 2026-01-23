package coding101days.day65;

import java.util.*;

/**
 * Day 65 — Group Anagrams
 * LeetCode #49
 *
 * Pattern: HashMap + Sorting
 *
 * Time Complexity: O(n * k log k)
 * Space Complexity: O(n)
 */
public class Day65GroupAnagrams {

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }
}
