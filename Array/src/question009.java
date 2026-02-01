import java.util.HashMap;

public class question009 {
    static void Twosum(int arr[], int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            int complement = target - arr[i];

            if(map.containsKey(complement)){
                System.out.println("Values = " + complement + " , " + arr[i]);
                System.out.println("Target = " + target);
                System.out.println("Indices = " + map.get(complement) + " , " + i);
                return;
            }
            map.put(arr[i], i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {2, 8, 11, 7, 15};
        int target = 9;
        Twosum(arr, target);
    }
}
