package coding101days.day24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day24KthSmallestElementinaSortedMatrix {


    public static void main(String[] args) {
        int[][] array = {{1,2},{3,3}};
        int k = 2;
        System.out.println(kthSmallest(array,k));
    }
    public static int  kthSmallest(int[][] array, int k) {
        List<Integer> list = new ArrayList<>() ;

        for (int i = 0;i<array.length;i++){
            for (int j = 0;j<array[i].length;j++){
                list.add(array[i][j]);
            }
        }
//        Collections.sort(list);
        if(array.length==1){
            return array[0][0];
        }
        if(array.length==k){
            return list.get(k-2);
        }

        else {
            return list.get(k-1);
        }
    }
}
