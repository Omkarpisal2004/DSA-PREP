package Revision;

import java.util.Stack;

public class Largest_Rectangle_Histogram {
    static int maxArea(int heaight[]){
        int n = heaight.length;
        int left[] = new int[n];
        int right[] = new int[n];

        Stack<Integer> st = new Stack<>();

        //PSE
        for (int i = 0 ; i<n ; i++){
            while (!st.isEmpty() && heaight[st.peek()] >= heaight[i]){
                st.pop();
            }
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        st.clear();

        // NSE
        for (int i = n-1 ; i>=0 ;i--){
            while (!st.isEmpty() && heaight[st.peek()] >= heaight[i]){
                st.pop();
            }
            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        int max = 0 ;
        for (int i = 0 ; i<n ; i++){
            int width = right[i] - left[i] -1;
            int area = width * heaight[i];

            max = Math.max(area , max);
        }
        return max;
    }
    public static void main(String[] args) {
        int [] height = {2,1,5,6,2,3};
        System.out.println(maxArea(height));
    }
}
