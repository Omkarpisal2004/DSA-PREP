import java.util.HashMap;

public class question014 {
//Contains Duplicate
    public static void containsDuplicate(int [] arr){
        HashMap<Integer,Integer> map = new HashMap<>(); // hashmap to get indices
        for(int i = 0 ; i< arr.length;i++){

            if(map.containsKey(arr[i])){ // if the element is in map print it
                System.out.println("Duplicate :" + arr[i]);
                System.out.println("Indices :" +map.get(arr[i]) + "and" + i );
            }

            map.put(arr[i] , i); // else add in set
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,4,7,9,5,3,5,7,9,0,3,2,5};
        containsDuplicate(arr);
    }
}
