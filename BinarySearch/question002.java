package BinarySearch;
// Find First and Last Position of Element in Sorted Array
import java.util.Arrays;


public class question002 {
    public static int[] searchRange(int[] nums, int target) {
        return new int []{
                search(nums , target , true),
                search(nums , target , false)
        };
    }

    public static int search(int nums[], int target, boolean first) {

        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {

                ans = mid;

                if (first) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            } else if (target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int nums []= {5, 7, 7, 8, 8, 10};
        int target = 8 ;
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}
