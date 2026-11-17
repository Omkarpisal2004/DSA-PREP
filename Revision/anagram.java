package Revision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class anagram {
    static List<Integer> anagrams(String s , String p){
        HashMap<Character ,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0 ; i<p.length();i++){
            Character ch = p.charAt(i);
            map.put(ch , map.getOrDefault(ch , 0)+1);
        }
        int left = 0 ;
        int count = map.size();

        for (int right = 0 ; right<s.length();right++){
            Character ch = s.charAt(right);
            if(map.containsKey(ch)){
                map.put(ch , map.getOrDefault(ch , 0)-1);

                if(map.get(ch) == 0){
                    count--;
                }
            }

            if(right-left+1 == p.length()){

                if(count == 0){
                    list.add(left);
                }

                Character leftch = s.charAt(left);
                if (map.containsKey(leftch)){
                    map.put(leftch , map.getOrDefault(leftch ,0)+1);
                   if (map.get(leftch) == 1){
                       count++;
                   }
                }
                left++;
            }

        }
        return list;
    }
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> ans = anagrams(s, p);

        System.out.println(ans);
    }
}
