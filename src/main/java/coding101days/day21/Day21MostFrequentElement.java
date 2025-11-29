package coding101days.day21;

import java.util.HashMap;

/**
 * Day 21 — Most Frequent Element Using Hashing
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class Day21MostFrequentElement {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 4, 1};
        System.out.println(findMostFrequent(arr));
    }

    public static int findMostFrequent(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int mostFrequent = -1;

        for (int key : map.keySet()) {
            if (map.get(key) > maxFreq) {
                maxFreq = map.get(key);
                mostFrequent = key;
            }
        }

        return mostFrequent;
    }
}
