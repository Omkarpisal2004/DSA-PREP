import java.util.HashMap;

public class question022 {

    public static int BasketWithFruits(int fruits[]) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int left = 0;   // left pointer of sliding window
        int ans = 0;    // stores maximum number of fruits

        for(int right = 0; right < fruits.length; right++){

            int fruit = fruits[right];
            // current fruit type at index right

            // increase frequency of this fruit in hashmap
            // if fruit is not present, getOrDefault returns 0
            map.put(fruit , map.getOrDefault(fruit,0) + 1);

            // if more than 2 fruit types exist, shrink the window
            while(map.size() > 2){

                int leftFruit = fruits[left];

                // decrease frequency of the fruit leaving the window
                map.put(leftFruit , map.get(leftFruit) - 1);

                // if its count becomes 0, remove it from hashmap
                if(map.get(leftFruit) == 0){
                    map.remove(leftFruit);
                }

                left++; // move left pointer to shrink window
            }

            // update maximum window size
            ans = Math.max(ans , right - left + 1);
        }

        return ans;
    }

    public static void main(String[] args) {

        int fruits[] = {0,1,2,2};

        System.out.println("The total fruits are: " + BasketWithFruits(fruits));
    }
}