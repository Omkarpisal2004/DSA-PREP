package Revision;

public class sort_colors {
    static void sort(int [] nums){
        int left = 0 ; int curr = 0 ; int right = nums.length-1;
        while (curr <= right){
            if(nums[curr] == 0){
                int temp = nums[left];
                nums[left] = nums[curr];
                nums[curr] = temp;
                left++;
                curr++;
            } else if(nums[curr] == 1){
                curr++;
            } else {
                int temp = nums[right];
                nums[right] = nums[curr];
                nums[curr] = temp;
                right--;
            }
        }
    }
    public static void main(String[] args) {
int nums[] = {2,0,2,1,1,0};
sort(nums);
for (int i = 0 ; i<nums.length;i++){
    System.out.print(nums[i] + " ");
}
    }
}
