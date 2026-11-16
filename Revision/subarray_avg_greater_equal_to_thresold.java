package Revision;

public class subarray_avg_greater_equal_to_thresold {
    public static int numOfSubarrays(int[] arr, int k, int threshold) {

        int windowSum = 0;
        int count = 0;

        // First window
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int target = threshold * k;

        if (windowSum >= target) {
            count++;
        }

        // Slide window
        for (int i = k; i < arr.length; i++) {

            windowSum += arr[i] - arr[i - k];

            if (windowSum >= target) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
int nums[] = {2, 2, 2, 2, 5, 5, 5, 8};
int k = 3;
int th = 4 ;
        System.out.println(numOfSubarrays(nums , k , th));
    }
}
