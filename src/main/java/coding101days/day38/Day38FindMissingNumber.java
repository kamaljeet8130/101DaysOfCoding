package coding101days.day38;

import java.util.Arrays;

public class Day38FindMissingNumber {
    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 1, 4};
//        System.out.println(missingNumberWithBruteForce(nums));
        System.out.println(missingNumberWithOptimalApproach(nums));
    }

    public static int missingNumberWithBruteForce(int[] numbs) {
        Arrays.sort(numbs);
        int i = 0;
        while (i < numbs.length) {
            if (numbs[i] != i) {
                return i;
            }
            i++;
        }
        return i;
    }
    public static int missingNumberWithOptimalApproach(int[] numbs){
        int n = numbs.length;
        int sum =( n * (n+1))/2;
        int sum2 = 0;
        for(int i =0;i<numbs.length;i++){
            sum2+=numbs[i];
        }
        return sum-sum2;

    }
}
