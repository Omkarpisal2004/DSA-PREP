import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class question011 {

    public static List<List<Integer>> threeSum(int []arr){
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(arr); // sort the arr cuz 2 pointer works on sorted elements

        for(int i = 0 ; i< arr.length-2; i++){
            if(i>0 && arr[i] == arr[i-1]  ) continue; // skip for duplicates

            int left = i+1;
            int right = arr.length-1;

            while (left<right){
                int sum = arr[i] + arr[left]+arr[right]; // calculate the sum

                if(sum == 0){
                    result.add(Arrays.asList(arr[i] , arr[left] , arr[right]));
                    while (left<right && arr[left] == arr[left+1]) left++; // skip the same element
                    while (left<right && arr[right]==arr[right-1]) right--;

                    left++;
                    right--;
                } else if (sum<0) {
                    left++;
                }
                else right --;
            }
        }
        return result;

    }


    public static void main(String[] args) {

        // Example input array
        int[] arr = {-1, 0, 1, 2, -1, -4};

        // Call the threeSum method
        List<List<Integer>> result = threeSum(arr);

        // Print all triplets
        if (result.isEmpty()) {
            System.out.println("No triplets found.");
        } else {
            System.out.println("Triplets that sum to 0:");
            for (List<Integer> triplet : result) {
                System.out.println(triplet);
            }
        }
    }
    }

