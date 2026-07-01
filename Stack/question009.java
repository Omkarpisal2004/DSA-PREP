package Stack;
// maxmimal rectangle
import java.util.Stack;

public class question009 {
    static int MaxRectangle(char [][] matrix){
        int i = matrix.length;
        int j = matrix[0].length;
int maxArea = 0;
        int height[] = new int[j];
        for(int row = 0 ; row< i ; row++) {
            for (int col = 0; col< j; col++) {
                if (matrix[row][col] == '1') {
                    height[col]++;
                } else {
                    height[col] = 0;
                }
            }
            maxArea = Math.max(maxArea , histogram(height));
        }
        return maxArea;

    }
    static int histogram(int height[]){
        Stack<Integer> st = new Stack<>();
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];



        // Previous Smaller (Left)
        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() &&
                    height[st.peek()] >= height[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                left[i] = -1;
            } else {
                left[i] = st.peek();
            }

            st.push(i);
        }

        st.clear();

        // Next Smaller (Right)
        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() &&
                    height[st.peek()] >= height[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                right[i] = n;
            } else {
                right[i] = st.peek();
            }

            st.push(i);
        }

        int max = 0;

        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            int area = width * height[i];

            max = Math.max(max, area);
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
        System.out.println(MaxRectangle(matrix));
    }
}
