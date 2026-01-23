package coding101days.day71;

/**
 * Day 71 — String to Integer (atoi)
 * LeetCode #8
 *
 * Pattern: String Parsing
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class Day71StringToInteger {

    public static void main(String[] args) {
        System.out.println(myAtoi("   -42"));
    }

    public static int myAtoi(String s) {
        int i = 0, sign = 1, result = 0;
        int n = s.length();

        while (i < n && s.charAt(i) == ' ') i++;

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}
