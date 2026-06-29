package Stack;
 // Next Greatest left
import java.util.Arrays;
import java.util.Stack;

public class question003 {
    static int[] NGL (int arr[]){
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[arr.length];

        for (int i = 0 ; i<= arr.length-1 ; i++){
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
        System.out.println(Arrays.toString(NGL(arr)));
    }
}
