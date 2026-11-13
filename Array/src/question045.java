public class question045 {
    // move -ve nums to one side
    static void moveNegativeNums(int [] nums){
        int slow = 0 ;
        for (int fast = 0 ; fast<nums.length;fast++){
            if(nums[fast] < 0){
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {1, -2, 3, -4, 5, -6};
        moveNegativeNums(nums);
        for (int i = 0 ; i<nums.length ;i++){
            System.out.print(nums[i] + " ");
        }
    }
}
