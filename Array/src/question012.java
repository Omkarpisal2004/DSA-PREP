import java.util.Arrays;

public class question012 {
    // Dutch National Flag ( sort colors)
    //0s at start , then 1s , 2s
    // 0-> Red , 1-> White , 2 -> Blue
    public  static  void sortcolors(int arr[]){
        int low = 0;
        int current = 0;
        int high = arr.length-1;

        while (current<=high){
            if(arr[current] == 0){
                //swap it with low cuz 0 should be at correct position
                int temp = arr[low];
                arr[low] = arr[current];
                arr[current] = temp;
                low++;
                current++;
            }
            else if (arr[current] == 1) {
                current++; // no swap cuz 1 at correct position
            }
             else {
                 // swap with current and decrement high
                 int temp = arr[high];
                 arr[high] = arr[current];
                 arr[current] = temp;
                 high--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {2, 0, 2, 1, 1, 0};

        System.out.println("Before sorting" );
        System.out.println(Arrays.toString(arr));

        sortcolors(arr);


        System.out.println("After sorting" );
        System.out.println(Arrays.toString(arr));
    }
}
