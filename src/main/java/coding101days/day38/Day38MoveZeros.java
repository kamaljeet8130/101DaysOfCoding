package coding101days.day38;

public class Day38MoveZeros {
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,2,9,0,0,0,4,5,1};
        moveZero(arr);
    }
    public static void moveZero(int[] arr){
        int j = 0;
        for (int i = 0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
}
