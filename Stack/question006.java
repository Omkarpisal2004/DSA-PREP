package Stack;
// online stack span
import java.util.Arrays;
import java.util.Stack;

public class question006 {
    static int[] stockSpan(int []arr){
        Stack<Integer> st = new Stack<>();
        int span[] = new int[arr.length];
        for (int i=0 ; i< arr.length;i++){
            while (!st.isEmpty() &&arr[ st.peek()] <= arr[i]){
                st.pop();
            }

            if (st.isEmpty()){
                span[i] = i+1;
            } else {
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        return span;
    }
    public static void main(String[] args) {
        int arr[] = {100, 80, 60, 70, 60, 75, 85};
        System.out.println(Arrays.toString(stockSpan(arr)));
    }
}

