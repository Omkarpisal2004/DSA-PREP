package strings.src;
// Longest Substring without repeating char
public class question008 {
    static int longestSubstring(String s){
        int left = 0 ; int max= 0;
        int freq[] = new int[128];
        for (int right = 0 ; right<s.length() ;right++){
            char ch = s.charAt(right);

            freq[ch]++;

            while (freq[ch] > 1){
                char c = s.charAt(left);
                freq[c]--;
                left++;
            }
            max = Math.max(max , right-left+1);
        }
        return  max;
    }
    public static void main(String[] args) {
        String s = "abcacbaabcd";
        System.out.println(longestSubstring(s));
    }
}
