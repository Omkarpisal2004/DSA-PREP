package Revision;

public class move_zeroes {
    static void move(int nums[]){
        int slow = 0 ;
        for (int fast = 0 ; fast<nums.length;fast++){
            if(nums[fast] != 0){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        while (slow < nums.length){
            nums[slow] = 0 ;
            slow++;
        }

    }
    public static void main(String[] args) {

        int nums[] = {0,1,0,2,0,3};
         move(nums);
        for (int i = 0 ; i< nums.length ;i++){
            System.out.println(nums[i] + " ");
        }
    }
}
