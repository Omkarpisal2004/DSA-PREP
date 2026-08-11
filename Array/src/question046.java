public class question046 {
    static int allow_max_2_duplicate(int [] nums){
        int slow = 0 ; int count = 0 ;
        for (int fast = 0 ; fast< nums.length;fast++){
            if(fast == 0 ||nums[fast] != nums[fast-1]){
                count = 1 ;
            } else count++;

            if(count <= 2){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;

    }
    public static void main(String[] args) {

int nums[] = {1,1,1,2,2,3};
        System.out.println(allow_max_2_duplicate(nums));
for (int i = 0 ; i< nums.length;i++){
    System.out.print(nums[i] + " ");
}
    }
}
