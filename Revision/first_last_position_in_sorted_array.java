package Revision;

public class first_last_position_in_sorted_array {

    static int[] firstnlat(int nums[], int target) {

        return new int[]{
                position(nums, target, true),
                position(nums, target, false)
        };
    }

    static int position(int nums[], int target, boolean first) {

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

        int nums[] = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int result[] = firstnlat(nums, target);

        System.out.println(java.util.Arrays.toString(result));
    }
}