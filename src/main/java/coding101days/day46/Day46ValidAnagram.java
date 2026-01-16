package coding101days.day46;

import java.util.HashMap;

public class Day46ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagramBruteForceApproach("anagram", "nagaram"));


    }

    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i = 0;i<t.length();i++){
            map2.put(t.charAt(i),map2.getOrDefault(t.charAt(i),0)+1);
        }
        return map2.equals(map);

    }
    public static boolean isAnagramBruteForceApproach(String s, String t){
        if(s.length()!=t.length())return false;
        StringBuilder sb = new StringBuilder(t);
        int count =0;
        for(int i = 0;i<s.length();i++){
            for(int j = 0;j<sb.length();j++){
                if(s.charAt(i)==sb.charAt(j)){
                    sb.setCharAt(j,'#');
                    count++;
                    break;
                }
            }
        }
        return count==s.length();

    }
    }

