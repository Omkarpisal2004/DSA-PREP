public class question020 {
    public static  int consecutiveOnes3(int nums[] , int k){
        int left = 0;
        int ans = 0;
        int zero = 0;

        for(int right = 0;right<nums.length;right++){
            if(nums[right] == 0){
                zero++;
            }

            while (zero>k){
                if (nums[left] == 0){
                    zero--;
                }
                left++;
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        System.out.println("Consucutive ones 3 are : "+consecutiveOnes3(nums,k));
    }
}
