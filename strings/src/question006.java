package strings.src;

// first unique char
public class question006 {
    static int firstUnique(String s){
        int freq[] = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch -'a']++;
        }
        for(int i = 0 ; i<s.length();i++){
            if(freq[s.charAt(i)-'a'] == 1){
                return i ;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUnique(s));
    }
}
