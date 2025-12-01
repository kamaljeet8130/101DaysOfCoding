package coding101days.day20;

public class Day20BasicOfHashing {
    public static void main(String[] args) {
        int[] arr = {5,4,6,6,6,2,1,4,1};
        int[] hash = new int[max(arr)+1];
        for(int i = 0;i<arr.length;i++){
            hash[arr[i]]++;
        }
        int maxFreq = max(hash);
        int mostFrequentValue = -1;

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] == maxFreq) {
                mostFrequentValue = i;
                break;   // first most frequent value
            }
        }
        System.out.println(mostFrequentValue);
    }
    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (j >= max) {
                max = j;
            }
        }
        return max;
    }
}
