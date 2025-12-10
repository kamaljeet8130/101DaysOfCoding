package coding101days.day32;

import java.util.HashMap;

public class Day32FirstUniqueCharacter {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("loveleetcode")); // Output: 2
    }

    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequencies
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Find first character with freq = 1
        for (int i = 0; i < s.length(); i++) {
            if (map.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }
}
