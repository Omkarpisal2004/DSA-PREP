public class question019 {
    //. Max Consecutive Ones 2
    //we can flip only one zero to achieve max consecutive
    public static int maxConsecutive2(int nums[]){
        int left = 0;
        int zero = 0;
        int ans = 0;

        for(int right = 0 ; right<nums.length;right++){
            if(nums[right] == 0){
                zero++;
            }

            while (zero>1){
                if(nums[left] == 0){
                    zero--;
                }
                left++;
            }
            ans =Math.max(ans,right-left+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,0,1,0,1,1,0,1,1};
        System.out.println(maxConsecutive2(nums));
    }
}
