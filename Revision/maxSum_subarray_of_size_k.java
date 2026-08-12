package Revision;

public class maxSum_subarray_of_size_k {
    static int maxSum(int nums[] , int k){
        int windowSum = 0 ;
        for (int i = 0 ; i<k ; i++){
            windowSum += nums[i];
        }
        int max = windowSum;

        // remaining sliding window
        for (int i = k ; i<nums.length;i++){
            windowSum = windowSum + nums[i] -nums[i-k];
            max = Math.max(max,windowSum);
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[] = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(maxSum(nums,k));
    }
}
