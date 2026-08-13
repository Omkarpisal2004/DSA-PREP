package Revision;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class first_negative_element {
    static List<Integer> remove(int nums[] , int k){
        Queue<Integer> queue = new ArrayDeque<>();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0 ; i<k ; i++){
            if(nums[i] < 0){
                queue.add(i);
            }
        }
        // first k window ka ans (agar -ve element hai toh listmeh add kr nhi toh zer0)
        ans.add(queue.isEmpty() ? 0 : nums[queue.peek()]);
        for (int i = k ; i< nums.length;i++){
            if(nums[i] < 0){
                queue.add(i);
            }
            if( !queue.isEmpty() &&  queue.peek() < i-k+1){
                queue.remove();
            }
            // current window ka ans
            ans.add(queue.isEmpty() ? 0 : nums[queue.peek()]);
        }
        return ans;    }
    public static void main(String[] args) {
int nums[] = {12,-1,-7,8,-15,30,16,28};
int k = 3 ;
        System.out.println( remove(nums,k));
    }
}
