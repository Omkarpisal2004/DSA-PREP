package strings.src;

import java.util.Arrays;

public class question001 {
    public static void reverseString (char[] s){
        int left = 0;
        int right = s.length-1;

        while (left<right){
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
       reverseString(s);
        System.out.println("The reverse string is : "+ Arrays.toString(s));

    }
}
