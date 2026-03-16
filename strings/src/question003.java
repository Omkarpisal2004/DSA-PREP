package strings.src;

public class question003 {

    public static boolean validPalindrome(String s ){


        int left = 0;
        int right = s.length() - 1;


        while (left < right){

            // If characters are not equal
            if(s.charAt(left) != s.charAt(right)){

                // We are allowed to delete one character
                // So we try two possibilities:
                // 1) Skip the left character
                // 2) Skip the right character

                return isPalindrome(s, left + 1, right) ||   // skip left
                        isPalindrome(s, left, right - 1);     // skip right
            }

            // If characters match, move both pointers
            left++;
            right--;
        }

        // If loop completes, string is already a palindrome
        return true;
    }


    // Helper function to check if substring is palindrome
    // from index left to index right
    public static boolean isPalindrome(String s , int left , int right){


        while (left < right){

            // If characters do not match → not a palindrome
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }

            // Move pointers
            left++;
            right--;
        }


        return true;
    }


    public static void main(String[] args) {


        String s = "abc";


        System.out.println(validPalindrome(s));
    }
}