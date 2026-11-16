package Revision;

import java.util.HashMap;

public class longest_substring_without_repeating_char {
    static int longestsubstring(String s){
        int left = 0 ;
        int max = 0 ;

        HashMap<Character , Integer> map = new HashMap<>();
        for (int right = 0 ; right<s.length() ; right++){
            char ch = s.charAt(right);

            if(map.containsKey(ch) && map.get(ch) >= left){
                left = map.get(ch)+1;
            }
            map.put(ch ,right);

            int currentlength = right-left+1;

            max = Math.max(max , currentlength);
        }
        return max;
    }
    public static void main(String[] args) {
String s = "abcabcbb";
        System.out.println(longestsubstring(s));
    }
}
