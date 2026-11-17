package Revision;

public class sub_array_product_lessthan_k {
    static int productlessthank(int nums[] , int k){
        int count = 0 ; int product = 1 ; int left = 0 ;

        for (int right = 0 ; right<nums.length ;right++){
            product *= nums[right];

            while (product>=k){
                product /= nums[left];
                left++;
            }
            count +=  right-left+1;
        }
        return count;
    }
    public static void main(String[] args) {
        int nums[] = {10,5,2,6};
        int k = 100;
        System.out.println(productlessthank(nums,k));
    }
}
