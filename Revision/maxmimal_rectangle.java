package Revision;

import java.util.Stack;

public class maxmimal_rectangle {
    static int maxmimaus(char [][] matrix){
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int i = matrix.length;
        int j = matrix[0].length;
        int maxArea= 0;
        int height[] = new int[j];
        for (int row = 0 ; row<i ; row++){
            for (int col = 0 ; col<j;col++){
                if(matrix[row][col] == '1'){
                    height[col]++;
                } else {
                    height[col] = 0;
                }
            }
            maxArea = Math.max(maxArea , histogram(height));
        }
        return maxArea;

    }
    static int histogram(int [] heaight){
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
        char[][] matrix = {
                {'1','0','1','0','0'},
                {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}
        };
        System.out.println(maxmimaus(matrix));
    }
}
