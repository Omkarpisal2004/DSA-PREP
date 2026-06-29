package Stack;
// valid parenthesis
import java.util.Stack;

public class question001 {
    static boolean isValid(String s){
        Stack<Character > st = new Stack<>();

        for (char ch :s.toCharArray()){ // if opening bracket occur we push closing in stack
            if(ch == '(' ) st.push(')');
            else if(ch == '[' ) st.push(']');
            else if(ch == '{') st.push('}');
            else {
                if(st.isEmpty() || st.pop() != ch){ // if stack is not empty and poped element != ch
                    return false;
                }
            }

        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
String s = "({[]})";
        System.out.println(isValid(s));
    }
}
