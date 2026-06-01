import java.util.Arrays;
// non overlapping interval
public class question038 {
    static int nonverlap(int [][] interval){
        Arrays.sort(interval , (a, b) -> a[1]-b[1]);
        int count = 0 ; int prevend = interval[0][1];

        for (int i = 1 ; i<interval.length ;i++ ){
            if(interval[i][0] < prevend){
                count++;
            } else {
                prevend =  interval[i][1];
            }
        }
        return count;
    }
    public static void main(String[] args) {

        int[][] interval = {
                {1,2},{2,3},{3,4},{1,3}
        };
        int ans = nonverlap(interval);
        System.out.println(ans);
    }
}
