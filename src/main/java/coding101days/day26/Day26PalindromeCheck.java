package coding101days.day26;

public class Day26PalindromeCheck {
    public static void main(String[] args) {
        System.out.println(palindromeCheck("hannah"));
    }

    public static boolean palindromeCheck(String s) {
        int left = 0;
        int right = s.length()-1;
        while (left <right) {
            if (s.charAt(left)!= s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
/*
* You are given a string s. Return true if the string is palindrome, otherwise false.
A string is called palindrome if it reads the same forward and backward.
Examples:
Input : s = "hannah"
Output : true
Explanation :
The given string when read backward is -> "hannah", which is same as when read forward.
Hence answer is true.
Input : s = "aabbaaa"
Output : false
Explanation :
The given string when read backward is -> "aaabbaa", which is not same as when read forward.
Hence answer is false.
 */