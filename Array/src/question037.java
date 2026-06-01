import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Insert Interval
public class question037 {
    static int [][] innsert (int interval[][] , int newInterval[]){
        int i= 0 ; int n = interval.length;
        List<int[]> list = new ArrayList<>();
        // left non overlapping
        while (i<n && interval[i][1] < newInterval[0]){
            list.add(interval[i]);
            i++;
        }
        //overlap hua toh
        while (i<n && interval[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(interval[i][0] , newInterval[0]);
            newInterval[1] = Math.max(interval[i][1] , newInterval[1]);
            i++;
        }
        list.add(newInterval);

        //add remaining one
        while (i<n){
            list.add(interval[i]);
            i++;
        }
        return list.toArray(new int[list.size()][]);
    }
    public static void main(String[] args) {
        int[][] interval = {
                {1,2},
                {3,5},
                {6,7},
                {8,10},
                {12,16}
        };

        int[] newInterval = {4,8};

        int[][] ans = innsert(interval, newInterval);

        for(int[] arr : ans) {
            System.out.println(Arrays.toString(arr));
        }
    }

}
