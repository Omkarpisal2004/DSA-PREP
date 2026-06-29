package Stack;
// Next Greater Right
import java.util.Arrays;
import java.util.Stack;

public class question002 {
    static int[] NGR(int [] arr){
        Stack<Integer> st = new Stack<>();
        int ans [] = new int[arr.length];

        for(int i = ans.length-1; i>=0 ; i--) { // reverse loop cuze we want greter right element
            while (!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            ans[i] = (st.isEmpty()) ? -1 : st.peek();
            st.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
int arr[] = {1,3,2,4};
        System.out.println(Arrays.toString(NGR(arr)));
    }
}
