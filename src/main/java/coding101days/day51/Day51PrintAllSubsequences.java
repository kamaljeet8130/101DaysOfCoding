package coding101days.day51;

public class Day51PrintAllSubsequences {

    public static void main(String[] args) {
        printSubsequence("abc", 0, "");
    }

    public static void printSubsequence(String s, int index, String current) {
        // Base case
        if (index == s.length()) {
            System.out.println(current);
            return;
        }

        // Choice 1: include current character
        printSubsequence(s, index + 1, current + s.charAt(index));

        // Choice 2: exclude current character
        printSubsequence(s, index + 1, current);
    }
}
