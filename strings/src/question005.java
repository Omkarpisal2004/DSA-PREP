package strings.src;
// same as longest palendromic substring here we have to return count
public class question005 {

    public static int palindromicSubstring(String s){
        int count = 0;
        for (int i = 0 ; i<s.length() ; i++){
            count += expand(s , i , i); // odd expand
            count += expand(s , i , i+1); // even
        }
        return count;
    }
    public static int expand(String s , int left , int right){
        int count= 0;
        while (left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "abc";
        int result = palindromicSubstring(s);
        System.out.println("The number of paildromic string are : "+result);
    }
}
