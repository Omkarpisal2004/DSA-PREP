package Revision;

import java.util.HashMap;

public class permutation_in_string {
    static boolean permutation(String s1 , String  s2){
        HashMap<Character ,Integer> map = new HashMap<>();

        for (int i = 0 ; i<s1.length();i++){
            Character ch = s1.charAt(i);
            map.put(ch , map.getOrDefault(ch , 0)+1);
        }
        int left = 0 ;
        int count = map.size();
        for (int right = 0 ; right<s2.length();right++){
            Character ch = s2.charAt(right);
          if(map.containsKey(ch)){
              map.put(ch , map.getOrDefault(ch ,0)-1);
              if(map.get(ch)==0){
                  count--;
              }
          }

          if(right-left+1 == s1.length()) {

              if (count == 0) {
                  return true;
              }

              Character chleft = s2.charAt(left);
              if (map.containsKey(chleft)) {
                  map.put(chleft, map.getOrDefault(chleft, 0) + 1);

                  if (map.get(chleft) == 1) {
                      count++;
                  }
              }
              left++;
          }


        }
        return false;
    }
    public static void main(String[] args) {
        String s2 = "eidbaooo";
        String s1 = "ab";


        System.out.println(permutation(s1, s2));
    }
}
