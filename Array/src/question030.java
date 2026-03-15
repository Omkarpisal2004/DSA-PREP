public class question030 {

    public static int MaxSumCircularSubArray(int nums[]) {

        // total sum of the array
        int totalSum = nums[0];

        // variables for Kadane's algorithm (maximum subarray)
        int maxSum = nums[0];     // stores maximum subarray sum found so far
        int curMax = nums[0];     // current maximum ending at index i

        // variables for minimum subarray (needed for circular case)
        int minSum = nums[0];     // stores minimum subarray sum found so far
        int curMin = nums[0];     // current minimum ending at index i

        // traverse array starting from index 1
        for (int i = 1; i < nums.length; i++) {

            // Kadane's algorithm to find maximum subarray sum
            // either start new subarray from nums[i] or extend previous subarray
            curMax = Math.max(nums[i], curMax + nums[i]);
            maxSum = Math.max(maxSum, curMax);

            // similar logic but for minimum subarray
            // needed to compute circular maximum
            curMin = Math.min(nums[i], curMin + nums[i]);
            minSum = Math.min(minSum, curMin);

            // keep adding elements to get total array sum
            totalSum += nums[i];
        }

        // edge case: if all numbers are negative
        // in this case circular sum becomes incorrect
        if (maxSum < 0) {
            return maxSum;
        }

        // final answer:
        // maximum of normal subarray OR circular subarray
        return Math.max(maxSum, totalSum - minSum);
    }

    public static void main(String[] args) {
        int nums[] = {5, -3, 5};
        System.out.println(MaxSumCircularSubArray(nums));
    }
}