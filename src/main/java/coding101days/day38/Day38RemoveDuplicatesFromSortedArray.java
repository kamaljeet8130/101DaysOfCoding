package coding101days.day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Day38RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0, 0, 3, 3, 5, 6};
//        System.out.println(removeDuplicatesByUsingBruteForce(arr));
        System.out.println(removeDuplicateByUsingOptimalSolution(arr));

    }
    public static int removeDuplicatesByUsingBruteForce(int[] arr){
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : arr){
            set.add(i);
        }
        int count = 0;
        for(int i : set){
            arr[count++] = i;
        }
        for(int i : arr){
            System.out.print(i + " ,");
        }
        System.out.println();
        return count;
    }
    public static int removeDuplicateByUsingOptimalSolution(int[] arr){
        //two pointer approach!!
        int i = 0;
        for(int j = 1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[++i] = arr[j];
            }
        }
        for (int j : arr){
            System.out.print(j+" , ");
        }
        System.out.println();
        return i;
    }
}

