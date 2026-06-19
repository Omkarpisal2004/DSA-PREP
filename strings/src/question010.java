package strings.src;
// longest repeating char replacement
public class question010 {
    static int longestReplace(String s , int k){
        int freq [] = new int[26];
        int left = 0 ;
         int ans = 0 ;
         int maxFreq = 0 ;
        for (int right = 0 ; right<s.length();right++){
            char ch = s.charAt(right);

            freq[ch -'A']++;
            maxFreq = Math.max(maxFreq , freq[ch -'A']);

            while ((right-left+1) - maxFreq > k ){
                freq[s.charAt(left) -'A']--;
                left ++;
            }
            ans = Math.max(ans , right-left+1);
        }
        return ans;
    }
    public static void main(String[] args) {
String s = "AABABB";
int k = 2 ;
        System.out.println(longestReplace(s,k));
    }
}
