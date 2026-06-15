package BinarySearch;
//split array lagrest sum
public class question009 {
    static int split (int nums[] , int k){
        int left = 0 ; int right = 0 ;
        for (int ele : nums){
            left = Math.max(left , ele);
            right += ele;
        }
        while (left<right){
            int mid = left + (right - left)/2;
            if(max(nums , k , mid)){
                right = mid ;
            } else {
                left = mid+1;
            }
        }
        return  left;

    }
    static boolean max(int nums[] , int k , int mid){
        int sum = 0 ;
        int parts = 1;
        for (int ele : nums){
            if(sum + ele > mid){
                parts++;
                sum = ele;
            } else sum += ele;
        }
        return parts<=k;
    }
    public static void main(String[] args) {
int nums [] = {7,2,5,10,8};
int k = 2 ;
        System.out.println(split(nums , k));
    }
}
