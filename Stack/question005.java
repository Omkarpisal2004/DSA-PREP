package Stack;
//Next smallest Right
import java.util.Arrays;
import java.util.Stack;

public class question005 {
    static int[] NSR(int arr[]){
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[arr.length];

        for (int i = arr.length-1 ; i>=0 ;i--){
            while (!st.isEmpty() && st.peek() >= arr[i]){
                st.pop();
            }
            ans[i] = (st.isEmpty()) ? -1 : st.peek();
            st.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {4 , 5 , 2 ,10 , 8};
        System.out.println(Arrays.toString(NSR(arr)));
    }
}
