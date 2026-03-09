public class question018 {
    //. Max Consecutive Ones
    public static int consecutiveOne(int nums[]){
        int count = 0;
        int maxCount = 0;

        for (int i = 0;i<nums.length;i++){
            if(nums[i] ==1){
                count++;
                maxCount = Math.max(count,maxCount);
            }
            else {
                count=0;
            }
        }
        return maxCount;
    }
    public static void main(String[] args) {
        int nums[] = {1, 1, 0, 1, 1, 1};
        System.out.println(" Consecutive one : "+ consecutiveOne(nums));
    }
}
