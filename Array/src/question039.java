import java.util.Arrays;
// Meeting rooms 1
public class question039 {
    static boolean meetingAttend (int [][] interval){
        Arrays.sort(interval , (a, b) -> a[0]-b[0]);
        int prevend = interval[0][1];

        for (int i = 1 ; i<interval.length ; i++){
            if(interval[i][0] < prevend){
                return false;
            }
            prevend = interval[i][1];
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] interval = {
                {0,30},{5,10},{15,20}
        };
        System.out.println(meetingAttend(interval));
    }
}
