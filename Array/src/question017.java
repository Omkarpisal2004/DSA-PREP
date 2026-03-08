public class question017 {
    public static int maxSum(int[] arr, int k) {

        int windowSum = 0;

        for(int i = 0; i < k; i++){
            windowSum += arr[i];
        }

        int maxSum = windowSum;

        for(int i = k; i < arr.length; i++){

            windowSum = windowSum + arr[i] - arr[i-k];

            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }
    public static void main(String[] args) {
        int nums [] = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println("Max sum of subarray :" + maxSum(nums,k));
    }
}
