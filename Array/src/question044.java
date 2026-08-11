public class question044 {
    // sort array by parity , even nums phele then odd
    static void parity(int nums[]){
        int slow = 0 ;
        for (int fast = 0 ; fast<nums.length ;fast++){
            if(nums[fast] % 2 == 0){
                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;
                slow++;
            }
        }
    }
    public static void main(String[] args) {
      int nums[] = {0,1};
      parity(nums);
      for (int i = 0 ; i< nums.length; i++){
          System.out.println(nums[i] + " ");
      }
    }
}
