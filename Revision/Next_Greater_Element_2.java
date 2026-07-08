package Revision;

import java.util.Arrays;
import java.util.Stack;

// circular array
public class Next_Greater_Element_2 {
    static int [] circular(int arr[]){
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[arr.length];
        int n = arr.length;
        for (int i = 2*n-1 ; i>=0 ;i--){
            while (!st.isEmpty() && arr[st.peek()] <= arr[i%n]){
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
