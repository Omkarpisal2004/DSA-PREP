package Revision;

public class longest_repeat_char_replacement {
    static int longestrepeatcharreplacemet(String s , int k){
        int left = 0 ; int maxlenth = 0 ; int maxfreq = 0 ;
        int freq [] = new int [26];

        for(int right = 0 ; right<s.length() ;right++){
            char ch = s.charAt(right);

            freq[ch -'A']++;

            maxfreq = Math.max(maxfreq , freq[ch -'A']);
            int windowlength = right -left +1 ;

            while (windowlength - maxfreq > k ){
                char ch2 = s.charAt(left);
                freq[ch2 -'A']--;
                left++;

                windowlength = right - left +1;
            }
            maxlenth = Math.max(maxlenth , windowlength);
        }
        return maxlenth;
    }
    public static void main(String[] args) {
String s = "AABAB";
int k = 1 ;
        System.out.println(longestrepeatcharreplacemet(s,k));
    }
}
