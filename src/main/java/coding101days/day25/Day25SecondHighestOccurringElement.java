package coding101days.day25;

public class Day25SecondHighestOccurringElement {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,3,3};
        System.out.println(secondHighestOccurringElement(arr));

    }
    public static int secondHighestOccurringElement(int[] arr){
        int[] hash = new int[findMaxElement(arr)+1];
        for(int i = 0;i<arr.length;i++){
            hash[arr[i]]++;
        }
        int maxFreq=0;
        int secondMaxFreq=0;
        for(int i = 0;i<hash.length;i++){
            if(hash[i]>maxFreq){
                secondMaxFreq = maxFreq;
                maxFreq = hash[i];
            }
            else if(hash[i]>secondMaxFreq && hash[i]!=maxFreq){
                secondMaxFreq = hash[i];
            }
        }
        if(secondMaxFreq==0){
            return -1;
        }
        int result  = Integer.MAX_VALUE;
        for(int i = 0;i<hash.length;i++){
            if(hash[i]==secondMaxFreq){
                return Math.min(result,i);
            }
        }
        return result;
    }

    public static int findMaxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            if(i>max){
                max = i;
            }
        }
        return max;
    }
}

/*
Given an array of n integers, find the second most frequent element in it.
If there are multiple elements that appear second most frequent times, find the smallest of them.
If second most frequent element does not exist return -1.
Examples:
Input: arr = [1, 2, 2, 3, 3, 3]
Output: 2
Explanation:
The number 2 appears the second most (2 times) and number 3 appears the most(3 times).
Input: arr = [4, 4, 5, 5, 6, 7]
Output: 6
Explanation:
Both 6 and 7 appear second most times, but 6 is smaller.
Input: arr = [10, 9 ,7, 7]
Output:9
Constraints:
1 <= n <= 10^5
1 <= arr[i] <= 10^4
*/
