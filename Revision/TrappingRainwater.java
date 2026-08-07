package Revision;

public class TrappingRainwater {
    static int tapping (int height[]){
        int leftmax = 0; int rightmax = 0;
        int left = 0 ; int right = height.length-1;
        int water = 0;

        while (left < right){
            if (height[left] < height[right]){
                if( height[left] > leftmax){
                    leftmax = height[left];
                } else water+= leftmax - height[left];
                left++;
            } else {
                if(height[right] > rightmax){
                    rightmax = height[right];
                } else water += rightmax - height[right];
                right--;
            }
        }
        return water;
    }
    public static void main(String[] args) {
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int ans = tapping(height);
        System.out.println(ans);
    }
}
