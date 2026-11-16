package Revision;

public class max_number_of_vowels_insubstring {

    static int maxVowel(String s , int k){
        int windowVowel = 0 ;
        for (int i = 0 ; i<k ;i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                windowVowel++;
            }
        }
        int maxVowel = windowVowel;

        for (int j = k ; j <s.length() ;j++){
            if(isVowel(s.charAt(j-k))){
                windowVowel--;
            }

            if (isVowel(s.charAt(j))){
                windowVowel++;
            }
            maxVowel = Math.max(maxVowel , windowVowel);
        }
        return maxVowel;

    }

   static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ;
    }

    public static void main(String[] args) {
String s = "abciiidef";
int k = 3 ;

        System.out.println(maxVowel(s,k));
    }
}
