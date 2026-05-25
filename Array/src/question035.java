import java.util.HashMap;

// Longest subarray without repeating char
public class question035 {
    static int nonRepeat(String s){
        HashMap<Character , Integer> map = new HashMap<>();
        int left = 0 ; int maxLen = 0 ;
        for (int right = 0 ; right<s.length();right++){
            char ch = s.charAt(right);

            if(map.containsKey(ch)){  // if duplicate occur in hashmap , remove the previous index and update it
                left = Math.max(left , map.get(ch)+1);
            }
            map.put(ch , right);
            maxLen = Math.max(maxLen , right-left+1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
String s = "abcabcbb";
        System.out.println(nonRepeat(s));
    }
}
