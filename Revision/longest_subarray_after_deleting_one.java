package Revision;

public class longest_subarray_after_deleting_one {
    static int longets(int nums[]){
        int left = 0 ;
        int maxlength = 0;
        int zerocount = 0;

        for (int right = 0 ;right<nums.length ;right++){

            if(nums[right] == 0){
                zerocount++;
            }

            while (zerocount >1){
                if(nums[left] == 0){
                    zerocount--;
                }
                left++;
            }

            int currentlen = right - left +1;

            maxlength = Math.max(maxlength , currentlen-1);
        }
        return maxlength;
    }
    public static void main(String[] args) {

        int nums[] = {1,1 ,1};
        System.out.println(longets(nums));
    }
}
