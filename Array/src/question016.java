public class question016 {
    public static double findMaxAverage(int[] nums, int k) {
        int windowSum = 0 ;
        for(int i = 0 ; i<k ; i++){
            windowSum += nums[i];
        }

        int max = windowSum;
        for(int i = k ; i < nums.length;i++){
            windowSum = windowSum + nums[i] - nums[i-k];
            max = Math.max(max , windowSum);
        }
        return (double) max/k;
    }
    public static void main(String[] args) {
int nums [] = {1,12,-5,-6,50,3};
 int k = 4;
        System.out.println("Maximum AVERAGE of subarray of size k : " +
                findMaxAverage(nums,k));
    }
}
