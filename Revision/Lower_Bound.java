package Revision;

public class Lower_Bound {
    static int lowerBound(int nums[] , int target){
        int left = 0 ; int right = nums.length-1;
        int ans = nums.length;

        while (left<=right){
            int mid = left + (right-left)/2 ;

            if(nums[mid] >= target){
                ans = mid;
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 2, 2, 4, 5};
        int target = 2 ;
        System.out.println(lowerBound(nums , target));
    }
}
