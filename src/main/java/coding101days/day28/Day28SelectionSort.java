package coding101days.day28;

public class Day28SelectionSort {
    public static void main(String[] args) {
        int[] arr  = generateArray(100); //will for sure give tle!!
        selectionSort(arr);
    }
    public static void selectionSort(int[] arr){
        for (int i = 0;i<arr.length;i++){
            int minValue = minValueIndex(arr,i);
            swap(arr ,minValue,i);
        }
        for (int i : arr){
            System.out.print(i+ " , ");
        }
    }
    public static int minValueIndex(int[] arr, int  i){
        int minValue = i;
        while (i<arr.length){
            if(arr[i]< arr[minValue]){
                minValue = i;
            }
            i++;
        }
        return minValue;
    }
    public static void swap(int[] arr , int min ,int i){
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }

    public static int[] generateArray(int size){
        int[] arr = new int[size];
        for (int i = 0;i<size;i++){
            arr[i] = (int)(Math.random()*100000);
        }
        return  arr;
    }

}
