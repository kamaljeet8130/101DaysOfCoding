package coding101days.day42;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Day42ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.print(containsDuplicateWithBruteForce(nums));
        System.out.println(containDuplicateWithBetterApproach(nums));
        System.out.println(containDuplicateWithBetterApproach2(nums));



    }

    public static boolean containsDuplicateWithBruteForce(int[] nums) {
        for (int i =0;i<nums.length-1;i++){
            for (int j = i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    System.out.println(nums[i]);
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean containDuplicateWithBetterApproach(int[] nums){
        Arrays.sort(nums);
        for (int i = 0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                System.out.println(i);
                return true;
            }
        }
        return false;
        /*
        *this give TC : nlogn
        * Sc:constant*/

    }

    public static boolean containDuplicateWithBetterApproach2(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int val : nums){
            if(set.contains(val)){
                System.out.println(val);
                return true;
            }
            else {
                set.add(val);
            }
        }
        return  false;
    }

}
