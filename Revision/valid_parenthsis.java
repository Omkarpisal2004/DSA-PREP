package Revision;

import java.util.Stack;

public class valid_parenthsis {
    static boolean parenthesis(String s){
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()){
            if(ch == '(' ) st.push(')');
            else if(ch == '{') st.push('}');
            else if (ch == '[') st.push(']');
            else if(st.isEmpty() || st.pop() != ch){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "({[]}";
        System.out.println(parenthesis(s));
    }
}
