package coding101days.day20;

public class Day20CharacterHashingBasic {
    public static void main(String[] args) {

        char[] charArray = {'a','a','a','d','e','r','w'};
        int[] arr = new int[26];
        for (int i = 0; i < charArray.length; i++) {
            int index = charArray[i] - 'a';
            arr[index]++;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0) {
                System.out.println((char)(i + 'a') + " repeats :: " + arr[i] + " times");
            }
        }
    }
}
