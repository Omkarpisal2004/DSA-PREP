package BinarySearch;
//  Find the Smallest Divisor Given a Threshold
public class question006 {
    static int smallestDivisor(int[] nums, int threshold) {
        int left =  1 ;
        int right = 0;
        for(int ele : nums){
            right = Math.max(right , ele);
        }
        while(left < right){
            int mid = left +(right -left)/2;

            if(divisor(nums , threshold , mid)){
                right = mid;
            } else{

                left = mid+1;
            }
        }
        return left ;
    }

    static boolean divisor (int nums[] , int threshold , int mid){
        long d = 0;
        for(int ele : nums){
            d += (ele + mid -1)/mid;
        }
        return d <= threshold;
    }
    public static void main(String[] args) {
int [] nums = {1,2,5,9};
int threshold  = 6 ;
        System.out.println(smallestDivisor(nums , threshold));
    }
}
