package Revision;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Next_Greater_Element_1 {
    static int [] NGE1 (int nums1[] , int nums2 []){
        Stack<Integer> st = new Stack<>();
        HashMap<Integer , Integer> map = new HashMap<>();

        for (int i = nums2.length-1; i>=0 ; i--){
            while (!st.isEmpty() && st.peek() <= nums2[i]){
                st.pop();
            }
            if(st.isEmpty()){
                map.put(nums2[i] , -1);
            } else {
                map.put(nums2[i] , st.peek());
            }
            st.push(nums2[i]);
        }

        int ans [] = new int[nums1.length];
        for (int i = 0 ; i<ans.length ; i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums1[] = {4,1,2};
        int nums2[] = {1,3,4,2};
        System.out.println(Arrays.toString(NGE1(nums1,nums2)));
    }
}
