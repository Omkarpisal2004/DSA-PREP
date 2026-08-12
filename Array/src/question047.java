public class question047 {
    // Merge sorted array
    static void  merge(int[] nums1, int m, int[] nums2, int n){
       int i = m-1;
       int j = n-1;
       int k = nums1.length-1;

       while (i >=0 && j>=0){ // jab tak dono element valid hai tab tak
           if(nums1[i] > nums2[j]){
               nums1[k] = nums1[i];
               i--;
           } else {
               nums1[k] = nums2[j];
               j--;
           }
           k--;
       }

       // remaining j ke element add karede num1 meh
        while (j>=0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }


    }
    public static void main(String[] args) {
int nums1 [] = {1,2,3,0,0,0};
int m = 3;
int nums2 [] = {2,5,6};
int n = 3 ;
merge(nums1,m,nums2,n);
for (int i = 0 ; i<nums1.length;i++){
    System.out.print(nums1[i] + " ");
}
    }
}
