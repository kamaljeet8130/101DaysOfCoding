package coding101days.day37;

public class Day37LeftRotateByOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        printArray(arr);
        leftRotateByOne(arr);
        printArray(arr);
    }
    public static void leftRotateByOne(int[] arr){
        int temp = arr[0];
        for(int i = 0;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
    }
    public static void printArray(int[] arr){
        for (int i : arr){
            System.out.print(i +  " , ");
        }
    }

}
