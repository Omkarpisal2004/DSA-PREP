package Stack;
 // Largest Rectangle in Histogram
import java.util.Stack;

public class question008 {
    static int maxAREEA(int [] heaight){
        int n = heaight.length;
        int [] right = new int[n];
        int [] left = new int[n];

        Stack<Integer> st = new Stack<>();
        //NSL
        for (int i = 0 ; i<heaight.length;i++){
            while (!st.isEmpty() && heaight[st.peek()] >= heaight[i]){
                st.pop();
            }
            if(st.isEmpty()){
                left[i] = -1;
            } else {
                left[i] = st.peek();
            }
            st.push(i);
        }
        st.clear();

        //NSR
        for (int i = n-1 ; i>=0 ; i--){
            while (!st.isEmpty() && heaight[st.peek()] >= heaight[i]){
                st.pop();
            }
            if(st.isEmpty()){
                right[i] = n;
            } else {
                right[i] = st.peek();
            }
            st.push(i);
        }

        int max = 0 ;

        for (int i = 0 ; i<n ;i++){
            int width = right[i] - left[i] - 1;
            int area = width * heaight[i];

            max = Math.max(max , area);
        }
        return max;
    }
    public static void main(String[] args) {
int [] height = {2,1,5,6,2,3};
        System.out.println(maxAREEA(height));
    }
}
