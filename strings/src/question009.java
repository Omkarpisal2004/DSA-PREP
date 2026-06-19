package strings.src;
//  Permutation in String
public class question009 {
    static  boolean permutation(String  s1 , String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        int freq1[] = new int[26];
        int freq2[] = new int[26];

        // s ki freq
        for (char ch : s1.toCharArray()) {
            freq1[ch - 'a']++;
        }
        int k = s1.length();
        //first k
        for (int i = 0; i < k; i++) {
            freq2[s2.charAt(i) - 'a']++;
        }
        if (java.util.Arrays.equals(freq1, freq2)) {
            return true;
        }

        // slide window
        for (int right = k ; right < s2.length(); right++) {
            char add = s2.charAt(right);
            char remove = s2.charAt(right - k);

            freq2[add - 'a']++;
            freq2[remove - 'a']--;

            if (java.util.Arrays.equals(freq1, freq2)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "ab";
        String     s2 = "eidbaooo" ;
        System.out.println(permutation(s1 ,s2));
    }
}
