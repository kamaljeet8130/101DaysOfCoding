package coding101days.day26;

public class Day26BasicsOfStrings {
    public static void main(String[] args) {
        String s = "kamaljeet";
        for(int i = 0;i<s.length()-1;i++){
            if(s.charAt(i)=='a'){
               s=  s.replace(s.charAt(i),'r');
            }
        }
        System.out.println(s.substring(1,7));
    }
}
