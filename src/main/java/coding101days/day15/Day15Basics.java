package coding101days.day15;

public class Day15Basics {

    // Count digits
    public static int countDigits(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    // Count odd digits
    public static int countOddDigits(int n) {
        int count = 0;
        while (n != 0) {
            int d = n % 10;
            if (d % 2 != 0) count++;
            n /= 10;
        }
        return count;
    }

    // Reverse number
    public static int reverseNumber(int n) {
        int rev = 0;
        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    // Palindrome number
    public static boolean isPalindrome(int n) {
        return n == reverseNumber(n);
    }

    // Largest digit in number
    public static int largestDigit(int n) {
        int max = 0;
        while (n != 0) {
            max = Math.max(max, n % 10);
            n /= 10;
        }
        return max;
    }

    // Factorial
    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    // Armstrong
    public static boolean isArmstrong(int n) {
        int original = n;
        int digits = countDigits(n);
        int sum = 0;
        while (n != 0) {
            sum += Math.pow(n % 10, digits);
            n /= 10;
        }
        return sum == original;
    }

    // Perfect number
    public static boolean isPerfect(int n) {
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) sum += n / i;
            }
        }
        return n > 1 && sum == n;
    }

    // Prime number
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }

    // Count primes till N
    public static int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) if (isPrime(i)) count++;
        return count;
    }

    // GCD
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // LCM
    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }

    // Divisors of a number
    public static void printDivisors(int n) {
        for (int i = 1; i <= n; i++) if (n % i == 0) System.out.print(i + " ");
    }

    // Sum of array elements
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    // Count odd numbers in array
    public static int countOddInArray(int[] arr) {
        int count = 0;
        for (int x : arr) if (x % 2 != 0) count++;
        return count;
    }

    // Check if sorted
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) if (arr[i] < arr[i - 1]) return false;
        return true;
    }

    // Reverse array
    public static void reverseArray(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        System.out.println(countDigits(12345));
        System.out.println(isPrime(29));
        System.out.println(reverseNumber(9876));
    }
}
