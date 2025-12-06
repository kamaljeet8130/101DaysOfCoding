package coding101days.day28;

public class Day28BubbleSort {
    public static void main(String[] args) {
        int[] arr = generateArray(10);
        bubbleSort(arr);
    }
    public static int[] generateArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }
        return arr;
    }
    public static void bubbleSort(int[] arr){
        int i = arr.length-1;
        while (i!=0){
            for (int j = 0 ;j<i;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr , j, j+1);
                }
            }
            i--;
        }
        printArray(arr);
    }
    public static void swap(int[] arr , int num1, int num2){
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
    public static void printArray(int[] arr){
        for (int i : arr){
            System.out.print(i + " , ");
        }
    }
}
