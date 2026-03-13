public class question029 {

    public static int MaxProductSubArray(int nums[]){

        // max = maximum product ending at current index
        int max = nums[0];

        // min = minimum product ending at current index
        // we keep this because a negative number can turn
        // the minimum product into the maximum product later
        int min = nums[0];

        // result = overall maximum product found so far
        int result = nums[0];

        // start from index 1 because index 0 is already used
        for (int i = 1 ; i < nums.length; i++){

            // if current number is negative,
            // multiplying will flip signs
            // so max can become min and min can become max
            if(nums[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            }

            // choose the larger between:
            // 1. starting a new subarray from nums[i]
            // 2. continuing previous product (max * nums[i])
            max = Math.max(nums[i] , max * nums[i]);

            // choose the smaller between:
            // 1. starting new subarray
            // 2. continuing previous minimum product
            // this is needed because negative numbers
            // can make this minimum become maximum later
            min = Math.min(nums[i] , min * nums[i]);

            // update the global maximum product
            result = Math.max(result , max);
        }

        // return the maximum product subarray
        return result;
    }

    public static void main(String[] args) {
        int nums[] = {2,3,-2,4};
        System.out.println(MaxProductSubArray(nums));
    }
}