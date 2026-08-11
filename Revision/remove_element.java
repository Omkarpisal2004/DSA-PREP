package Revision;

public class remove_element {
    static int removeele(int nums[], int val) {
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        int nums[] = {3, 2, 2, 3};
        int val = 3;
        int ans = removeele(nums, val);
        for (int i = 0; i < ans; i++) {
            System.out.println(nums[i] + " ");
        }
    }
}
