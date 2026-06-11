package BinarySearch;
//index of target
public class question001 {
    static int index(int nums[] , int target){
        int left = 0 ; int right = nums.length-1;
        while (left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                return mid;
            } else if (target > nums[mid]){
                left = mid+1;
            } else right = mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums [] = {1,2, 3, 5, 6};
        int target = 2 ;
        System.out.println(index(nums , target));
    }
}
