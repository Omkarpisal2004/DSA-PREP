package Stack;

import java.util.Arrays;
import java.util.Stack;

// Next greater element  2
public class question011 {
    static int[] circular(int arr[]){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int ans[] = new int[n];

        for (int i = 2*n-1 ; i>=0 ; i--){
            while (!st.isEmpty() && arr[st.peek()] <=arr[i%n]){
                st.pop();
            }
            if(i<n){
                ans[i] = st.isEmpty() ? -1 : arr[st.peek()];
            }
            st.push(i%n);
        }
        return ans;
    }
    public static void main(String[] args) {
int arr[] = {1,2,1};
        System.out.println(Arrays.toString(circular(arr)));
    }
}
