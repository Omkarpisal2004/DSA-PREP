package Stack;
// Next Smallest Left
import java.util.Arrays;
import java.util.Stack;

public class question004 {
    static int[] NSL(int arr[]){
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[arr.length];

        for (int i = 0 ; i<= arr.length-1;i++){
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
        System.out.println(Arrays.toString(NSL(arr)));
    }
}
