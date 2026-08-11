package Revision;

import java.util.Arrays;

public class remove_duplicates {
    static int removeDupli(int[] nums){
        int slow = 0 ;
        for (int fast = 1 ; fast< nums.length ; fast++){
            if(nums[slow] != nums[fast]){
                slow++;
                nums[slow]= nums[fast];
            }
        }
        return slow + 1;
    }
    public static void main(String[] args) {
int nums[] = {1,1,2};
int ans = removeDupli(nums);
for (int i = 0 ; i<ans ; i++){
    System.out.println(nums[i] + " ");
}
    }
}
