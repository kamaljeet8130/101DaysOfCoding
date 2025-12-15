package coding101days.day38;

import java.util.ArrayList;
import java.util.Arrays;

public class Day38RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0, 0, 3, 3, 5, 6};
        for(int i = 1;i<arr.length-1;i++){
            for (int j = 0;j<arr.length-1;j++){
                if(arr[i] ==arr[j]){
                    swap(arr,j,j+1);
                }
            }

        }
        for (int k: arr){
            System.out.println(k);
        }
    }
    public static void swap(int[] arr,int num1,int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
}
