package coding101days.day29;

public class Day29InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,1,5,2,3};
        insertionSort(arr);
        printArray(arr);
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int previous = i - 1;
            while (previous >= 0 && arr[previous] > current) {
                arr[previous+ 1] = arr[previous];
                previous--;
            }
            arr[previous + 1] = current;
        }
    }
    public static void printArray(int[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + "");
        }
    }
}
