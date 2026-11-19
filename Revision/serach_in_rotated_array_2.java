package Revision;

public class serach_in_rotated_array_2 {
    static boolean search2(int nums[] , int target){
        int left = 0 ; int right = nums.length-1;

        while (left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                return true;
            }
            if(nums[left] == nums[mid] && nums[mid] == nums[right]){
                left++;
                right--;
            } else if (nums[left] <= nums[mid]) {
                if(target >= nums[left] && target < nums[mid]){
                    right = mid-1;
                } else {
                    left = mid+1;
                }
            } else if (target > nums[mid] && target <= nums[right]){
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
int nums[] = {2, 5, 6, 0, 0, 1, 2};
int target =0 ;
        System.out.println(search2(nums , target));
    }
}
