package coding101days.day25;

public class Day25SumHighestAndLowestFrequency {

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,3};
        System.out.println(sumHighestAndLowestFrequency(nums));

    }
    public static  int sumHighestAndLowestFrequency(int[] nums) {
        int[] hash = new int[findMax(nums)+1];
        for(int i = 0;i<nums.length;i++){
            hash[nums[i]]++;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0;i<hash.length;i++){
            if(hash[i]>max){
                max = hash[i];
            }
            if(hash[i] != 0 && hash[i]<min){
                min = hash[i];
            }
        }

        return max+min;
    }
    public static int findMax(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    }

}


/*
Given an array of n integers, find the sum of the frequencies of the highest occurring number and lowest occurring number.
Examples:
Input: arr = [1, 2, 2, 3, 3, 3]
Output: 4
Explanation: The highest frequency is 3 (element 3), and the lowest frequency is 1 (element 1). Their sum is 3 + 1 = 4.
Input: arr = [4, 4, 5, 5, 6]
Output: 3
Explanation: The highest frequency is 2 (elements 4 and 5), and the lowest frequency is 1 (element 6). Their sum is 2 + 1 = 3.
Input: arr = [10, 9, 7, 7, 8, 8, 8]
Output: 4
Constraints:
1 <= n <= 105
1 <= arr[i] <= 104
 */
