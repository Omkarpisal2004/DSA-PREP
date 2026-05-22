import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class question034 {
    static List<List<Integer>> esum (int arr[] , int target){
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);

        // fix First element
        for(int i = 0 ; i< arr.length-3 ; i++){
            if(i>0 && arr[i] == arr[i-1])
                continue;

            // fix second one
            for (int j = i+1 ; j< arr.length-2 ; j++){
                if(j>i+1 && arr[j] == arr[j-1])
                    continue;

//                then Two pointer approach
                int left = j+1 ; int right = arr.length-1;
                while (left<right){
                    int sum = arr[i] + arr[j] +arr[left] +arr[right];

                    if(sum == target ){
                        list.add(Arrays.asList(arr[i] , arr[j] , arr[left] , arr[right]));

                        while(left < right && arr[left] == arr[left + 1])
                            left++;

                        while(left < right && arr[right] == arr[right - 1])
                            right--;


                        left++;
                        right--;
                    } else if (sum>0) {
                        right--;
                    } else left++;
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int arr[] = {1, 0, -1, 0, -2, 2};
        int target = 0 ;

        List<List<Integer>> ans = esum(arr , target);

        System.out.println(ans);
    }
}
