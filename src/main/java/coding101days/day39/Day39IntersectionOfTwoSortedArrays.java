package coding101days.day39;

import java.util.*;

public class Day39IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {-17 ,-1, -1, 3};
        int[] nums2 = {-17 ,0 ,3 ,3};
//        intersectionArray(nums1,nums2);
        printArray(intersectionArray(nums1,nums2));
    }

    public static int[]  intersectionArray(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int val : nums1) {
            set.add(val);
        }
        List<Integer> commonList = new ArrayList<>();
        for (int val : nums2) {
            if (set.contains(val)) {
                commonList.add(val);
            }
        }
        Set<Integer> intersectionSet = new TreeSet<>(commonList);
        int[] intersection = new int[intersectionSet.size()];
        int count = 0;
        for (int val:intersectionSet){
            intersection[count++] = val;
        }
        return intersection;
    }
    public static void printArray(int[] arr){
        for (int val: arr){
            System.out.print(val + " ,");
        }
    }
}
