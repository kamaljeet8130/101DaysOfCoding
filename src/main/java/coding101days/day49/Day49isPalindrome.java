package coding101days.day49;

public class Day49isPalindrome {
    public static void main(String[] args) {
        String s ="madam";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        return check(s, 0, s.length() - 1);
    }

    public static boolean check(String s, int left, int right) {
        // Base case
        if (left >= right) {
            return true;
        }

        // If mismatch found
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        // Recursive call
        return check(s, left + 1, right - 1);
    }

}
