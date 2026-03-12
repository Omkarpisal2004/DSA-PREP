import java.util.HashMap;

public class question027 {
    //    ContinuousSubArraySum
    public static boolean ContinuousSubArraySum(int nums[] , int k){

        // HashMap stores: remainder -> first index where this remainder occurred
        HashMap<Integer,Integer> map = new HashMap<>();

        // Initialize with remainder 0 at index -1
        // This represents prefix sum = 0 before the array starts
        // It helps detect subarrays starting from index 0
        map.put(0,-1);

        int sum = 0; // running prefix sum

        for(int i = 0;i<nums.length;i++){

            // add current element to prefix sum
            sum += nums[i];

            // compute remainder when prefix sum is divided by k
            int remainder = sum % k;

            // if this remainder has appeared before
            if(map.containsKey(remainder)){

                // check if subarray length >= 2
                // i = current index
                // map.get(remainder) = previous index where same remainder appeared
                if(i - map.get(remainder) >= 2){
                    return true; // valid subarray found
                }
            }

            // store remainder only if it appears first time
            // we store first index because it gives maximum subarray length
            else {
                map.put(remainder,i);
            }
        }

        // if no valid subarray found
        return false;
    }

    public static void main(String[] args) {
        int nums[] = {23,2,4,6,7};
        int k = 6;
        System.out.println(ContinuousSubArraySum(nums,k));
    }
}