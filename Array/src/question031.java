public class question031 {

    public static int maxAbsoluteSum(int nums[]) {

        // maxsum stores the maximum subarray sum found so far
        int maxsum = 0;

        // currmax stores the maximum subarray sum ending at the current index
        int currmax = 0;

        // minsum stores the minimum subarray sum found so far
        int minsum = 0;

        // currmin stores the minimum subarray sum ending at the current index
        int currmin = 0;

        // traverse the array
        for(int i = 0 ; i < nums.length ; i++){

            // Kadane's algorithm for maximum subarray sum
            // choose the better option:
            // start new subarray from nums[i]
            // OR extend the previous subarray
            currmax = Math.max(nums[i] , currmax + nums[i]);

            // update the global maximum subarray sum
            maxsum = Math.max(maxsum , currmax);

            // similar logic but for minimum subarray sum
            // used to capture the largest negative subarray
            currmin = Math.min(nums[i], currmin + nums[i]);

            // update the global minimum subarray sum
            minsum = Math.min(minsum , currmin);
        }

        // return the maximum absolute value
        // because the largest absolute sum may come
        // from either a large positive sum or a large negative sum
        return Math.max(Math.abs(maxsum) , Math.abs(minsum));
    }

    public static void main(String[] args) {
        int nums[] = {1,-3,2,3,-4};
        System.out.println(maxAbsoluteSum(nums));
    }
}