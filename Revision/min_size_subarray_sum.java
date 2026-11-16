package Revision;

public class min_size_subarray_sum {
    static int minsize(int nums[] , int target){
        int left = 0 ;
        int minLength = Integer.MAX_VALUE;
        int windwosum = 0 ;
        for (int i = 0 ; i<nums.length ;i++){
            windwosum += nums[i] ;

            while (windwosum >= target ){
                minLength = Math.min(minLength , i-left+1);
                windwosum -= nums[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
    public static void main(String[] args) {
int nums[] = {2, 3, 1, 2, 4, 3}; int target = 7 ;
        System.out.println(minsize(nums , target));
    }
}
