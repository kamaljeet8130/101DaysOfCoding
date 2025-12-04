package coding101days.day26;

public class Day26LargestOddNumberInAString {
    public static void main(String[] args) {
        System.out.println(largeOddNum("00023450000000000000001"));
    }
    public static String largeOddNum(String s) {
        int lastOddIndex = -1;
        for(int i=s.length()-1;i>=0;i--){
            int digit = s.charAt(i)-'0';
            if(digit%2==1){
                lastOddIndex = i;
                break;
            }
        }
       if(lastOddIndex==-1){
           return "";
       }
       else{
           String result = s.substring(0,lastOddIndex+1);
           int i =0;
           while(i<result.length() && result.charAt(i)=='0'){
               i++;
           }
           return  result.substring(i);
       }
    }
}

/*
* Given a string s, representing a large integer, the task is to return the largest-valued odd integer (as a string) that is a substring of the given string s.
The number returned should not have leading zero's. But the given input string may have leading zero. (If no odd number is found, then return empty string.)
Examples:
Input : s = "5347"
Output : "5347"
Explanation :
The odd numbers formed by given strings are --> 5, 3, 53, 347, 5347.
So the largest among all the possible odd numbers for given string is 5347.
Input : s = "0214638"
Output : "21463"
Explanation :
The different odd numbers that can be formed by the given string are --> 1, 3, 21, 63, 463, 1463, 21463.
We cannot include 021463 as the number contains leading zero.
So the largest odd number in given string is 21463.
* */