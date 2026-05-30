import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Merge overlapping intervals
public class question036 {
    static int[][] merge(int[][] interval){
        Arrays.sort(interval , (a,b) ->a[0]-b[0]);
        List<int[]> list = new ArrayList<>();

        int start = interval[0][0];
        int end = interval[0][1];

        for (int i = 1 ; i<interval.length;i++){
            //if overlapp , then extend the end
            if(interval[i][0] <= end){
                end = Math.max(end , interval[i][1]);
            } else {
                // overlap nhi hua toh add
                list.add(new int[] {start , end});

                // update start and end
                start = interval[i][0];
                end = interval[i][1];
            }
        }
        list.add(new int[] {start , end}); // lat interval koadd karne ke liye
        return list.toArray(new int[list.size()][]);
    }
    public static void main(String[] args) {
        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };

        int[][] ans = merge(intervals);

        for (int[] interval : ans) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}
