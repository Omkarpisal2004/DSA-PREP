package Revision;

public class square_of_sorted_array {
    public static int[] squares(int nums[]){
        int left = 0 ;
        int right = nums.length-1;
        int pos = nums.length-1;

        int result[] = new int[nums.length];

        while (left <= right){
            int leftsquare = nums[left]*nums[left];
            int rightsquare = nums[right]*nums[right];

            if(leftsquare > rightsquare){
                result[pos] = leftsquare;
                left++;
            } else {
                result[pos] = rightsquare;
                right--;
            }

            pos--;
        }
        return result;
    }
    public static void main(String[] args) {
     int nums[] = {-7, -3, 2, 3, 11};
     int arr[] = squares(nums);
     for (int i = 0 ; i< arr.length ; i++){
         System.out.print(arr[i] + " ");
     }

    }
}
