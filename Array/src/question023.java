public class question023 {

    public static int MinimumSizeSubarraySum(int nums[], int target){

        int left = 0;
        int window = 0;
        int ans = Integer.MAX_VALUE;

        for(int right = 0; right < nums.length; right++){

            window += nums[right];

            while(window >= target){
                ans = Math.min(ans, right - left + 1);
                window -= nums[left];
                left++;
            }
        }

        if(ans == Integer.MAX_VALUE){
            return 0;
        }

        return ans;
    }

    public static void main(String[] args) {

        int nums[] = {2,3,1,2,4,3};
        int target = 7;

        System.out.println ( " Minimum size of sub array is : "+MinimumSizeSubarraySum(nums,target));
    }
}