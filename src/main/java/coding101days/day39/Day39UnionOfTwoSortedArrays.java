package coding101days.day39;

public class Day39UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 ={3, 4, 6, 7, 9, 9};
        int[] nums2 = {1, 5, 7, 8, 8};
        int[] arr = new int[nums1.length-1+nums2.length-1];
        int i = 0;
        int j =0;
        int count = 0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j] && !isAlreadyInserted(arr,nums1[i])){
                arr[count]=nums1[i];
                count++;
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j] && !isAlreadyInserted(arr,nums1[i])){
                arr[count] = nums1[i];
                count++;
                i++;
            }
            else{
                if(!isAlreadyInserted(arr,nums2[j])){
                    arr[count] = nums2[j];
                    count++;
                    j++;
                }

            }
        }
        while (i<nums1.length && isAlreadyInserted(arr,nums1[i])){
            arr[count] = nums1[i];
            count++;
            i++;
        }
        while (j<nums2.length && isAlreadyInserted(arr,nums2[j])){
            arr[count] = nums2[j];
            count++;
            j++;
        }
        for (int k:arr){
            System.out.print(k+ ",");
        }
    }
    public static boolean isAlreadyInserted(int[] arr,int num){
        for (int i = 0;i<arr.length;i++){
            if(arr[i] ==num ||  arr[i]== 0){
                return false;
            }
        }
        return true;
    }
}
