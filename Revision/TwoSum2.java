package Revision;

public class TwoSum2 {
    static int[] TwoSum(int arr[] , int target){
        int left = 0 ; int right = arr.length-1;
        while (left<right){
            int sum = arr[left] + arr[right];

            if(sum == target){
                return new int[]{left , right};
            } else if(sum>target){
                right--;
            } else left++;
        }
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15};
        int target = 17;

        int ans[] = TwoSum(arr, target);

        System.out.println(ans[0] + " " + ans[1]);
    }
}
