package coding101days.day26;

import java.util.ArrayList;
import java.util.List;

public class Day26ReverseAStringII {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.add('h');
        list.add('e');
        list.add('l');
        list.add('l');
        list.add('0');
        reverseString(list);
    }

    public static void reverseString(List<Character> s) {
        int left = 0;
        int right = s.size() - 1;
        while (left < right) {
            char temp = s.get(left);
            s.set(left, s.get(right));
            s.set(right, temp);
            right--;
            left++;
        }
        for(char i : s){
            System.out.print(i+",");
        }

    }
}

/*
* Given a string, the task is to reverse it. The string is represented by an array of characters s.
Perform the reversal in place with O(1) extra memory.
Note: no need to return anything, modify the given list.
Examples:
Input : s = ["h", "e" ,"l" ,"l" ,"o"]
Output : ["o", "l", "l", "e", "h"]
Explanation :
The given string is s = "hello" and after reversing it becomes s = "olleh".
Input : s = ["b", "y" ,"e" ]
Output : ["e", "y", "b"]
Explanation :
The given string is s = "bye" and after reversing it becomes s = "eyb".
* */