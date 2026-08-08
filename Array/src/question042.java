import java.util.Arrays;
// square of sorted array
public class question042 {
    static int[] squareOfSortedArray(int nums[]){
        int left = 0 ; int right =nums.length-1;
        int index = nums.length-1;
        int result[] = new int[nums.length];

        while (left<=right){
            int leftsq = nums[left]*nums[left];
            int rightsq = nums[right]*nums[right];

            if(leftsq > rightsq){
                result[index] = leftsq;
                left++;
            } else {
                result[index] = rightsq;
                right--;
            }
            index--;
        }
        return result;
    }
    public static void main(String[] args) {
       int nums[] = {-4,-3,0,1,8};
        System.out.println(Arrays.toString(squareOfSortedArray(nums)));
    }
}
