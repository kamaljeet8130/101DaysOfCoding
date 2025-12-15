package coding101days.day37;

public class Day37LeftRotateArrayByKPlaces {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k =10;
        k=k%arr.length;

        leftRoateByKPlace(arr,k);
        printArray(arr);
    }
    public static void leftRoateByKPlace(int[] arr,int k){
       reverse(arr,0,k-1);
       reverse(arr,k,arr.length-1);
       reverse(arr,0,arr.length-1);
    }
    public static void reverse(int[] arr ,int i,int j){
        while (i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    public static void printArray(int[] arr){
        for (int i : arr){
            System.out.print(i +  " , ");
        }
    }
    public static void swap(int[] arr ,int num1,int num2){
        int temp = arr[num1];
         arr[num1] = arr[num2];
        arr[num2] = temp;
    }

}
