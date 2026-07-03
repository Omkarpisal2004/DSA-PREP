package Stack;
// asteroid Collision
import java.util.Arrays;
import java.util.Stack;

public class question010 {

    static int[] asteroidsCollision(int [] asteroid){
        Stack<Integer> st = new Stack<>();


        for (int i = 0 ; i< asteroid.length;i++){
            boolean isAlive = true;
            while (!st.isEmpty() && st.peek() > 0 && asteroid[i] < 0){
                if(st.peek() < -asteroid[i]){
                    st.pop();
                } else if(st.peek() == -asteroid[i]){
                    st.pop();
                    isAlive = false;
                    break;
                } else {
                    isAlive = false;
                    break;
                }
            }
            if(isAlive){
                st.push(asteroid[i]);
            }
        }
        int ans[] = new int[st.size()];
        for (int i = st.size()-1 ; i>=0 ; i--){
            ans[i] = st.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
int [] asteroid = {5,10,-5};
        System.out.println(Arrays.toString(asteroidsCollision(asteroid)));
    }
}
