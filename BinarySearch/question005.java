package BinarySearch;
//koko eating banana
public class question005 {
    static int koko(int[] piles , int hours){
        int left = 1 ; // if start from 0 koko will have 0 hours per banana
        int right = 0 ;
        for (int element : piles){
            right = Math.max(right , element);
        }
        while (left<right){
            int mid = left + (right-left)/2;

            if(time(piles , hours , mid)){
                right = mid ;
            } else {
                left = mid+1;
            }
        }
        return left;
    }
    static boolean time (int [] piles , int hours , int speed){
        long hour = 0 ;
        for (int element : piles){
            hour += (element + speed -1)/speed;
        }
        if(hour > hours){
            return false ; // task ko limited time meh karna hai agar limited time se jada time liya toh false
        }
        return true;
    }
    public static void main(String[] args) {
        int piles[] = {3, 6, 7, 11};
        int h = 8 ;
        System.out.println(koko(piles , h));

    }
}
