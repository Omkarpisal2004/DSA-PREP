import java.util.HashMap;

public class question026 {
    public static int subarraysDivByK(int nums[] , int k){
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);
        int sum = 0;
        int count = 0;
        for(int num : nums){
            sum += num;

            int remainder = sum % k;

            if(remainder<0){ // if remainder is less than 0 we add k so it becomes +ve
                remainder += k;
            }

            if(map.containsKey(remainder)){
                count += map.get(remainder);
            }
            map.put(remainder , map.getOrDefault(remainder,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
int nums[] = {4,5,0,-2,-3,1};
int k = 5;
        System.out.println("SubArray sum divisible by K arae :  "+subarraysDivByK(nums,k));
    }
}
