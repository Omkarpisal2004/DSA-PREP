package Revision;

import java.util.HashMap;

public class fruits_into_basket {
    static int fruitsBasket(int fruits[]){

        int ans = 0;
        int left = 0;

        HashMap<Integer ,Integer> map = new HashMap<>();

        for (int right = 0 ; right<fruits.length ;right++){
            int rightfruit = fruits[right];

            map.put(rightfruit , map.getOrDefault(rightfruit , 0)+1);

            while (map.size() > 2){
                int leftfruit = fruits[left];
                map.put(leftfruit , map.get(leftfruit)-1);

                if(map.get(leftfruit) == 0){
                    map.remove(leftfruit);
                }
                left++;
            }
            ans = Math.max(ans , right-left+1);
        }
        return ans;
    }
    public static void main(String[] args) {
int fruits [] = {1,2,1,2,3};
        System.out.println(fruitsBasket(fruits));
    }
}
