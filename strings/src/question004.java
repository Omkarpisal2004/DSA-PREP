package strings.src;

public class question004 {

    public static String longestPalindrome(String s) {
        int start = 0, end = 0; // stores indices of longest palindrome found so far

        for (int i = 0; i < s.length(); i++) {

            // get palindrome length by expanding around center
            int len1 = expand(s, i, i);     // odd length palindrome (center at i)
            int len2 = expand(s, i, i + 1); // even length palindrome (center between i and i+1)

            int len = Math.max(len1, len2); // choose the longer one

            // if current palindrome is longer than previous best, update indices
            if (len >= end - start) {
                start = i - (len - 1) / 2; // calculate left boundary
                end = i + len / 2;         // calculate right boundary
            }
        }

        // return the longest palindromic substring
        return s.substring(start, end + 1);
    }

    private static int expand(String s, int left, int right) {
        // expand outward while characters match and indices are valid
        while (left >= 0 && right < s.length() &&
                s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        // subtract 1 because pointers go one step beyond valid palindrome
        return right - left - 1;
    }

    public static void main(String[] args) {
        String s = "babad";
        String result = longestPalindrome(s);
        System.out.println(result);
    }
}
