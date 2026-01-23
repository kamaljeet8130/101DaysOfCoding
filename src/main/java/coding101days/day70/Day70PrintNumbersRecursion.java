package coding101days.day70;

/**
 * Day 70 — Print Numbers from 1 to N using Recursion
 *
 * Pattern: Controlled Recursion
 */
public class Day70PrintNumbersRecursion {

    public static void main(String[] args) {
        printNumbers(5);
    }

    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        printNumbers(n - 1);
        System.out.print(n + " ");
    }
}
