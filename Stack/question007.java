package Stack;
// Daily temp
import java.util.Arrays;
import java.util.Stack;

public class question007 {
    static int[] DailyTemp (int [] temp){
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[temp.length];

        for (int i = temp.length-1; i>=0 ; i--){
            while (!st.isEmpty() && temp[st.peek()] <= temp[i]){
                st.pop();
            }

            if(st.isEmpty()){
                ans[i] = 0;
            } else {
                ans[i] = st.peek()-i;
            }
            st.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int temp[] = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(DailyTemp(temp)));
    }
}
