package Revision;

public class capacity_to_shippackages {
    static int shippackages(int weights[] , int days){
        int left = 0 ; int right = 0 ;
        for (int weight : weights){
            left = Math.max(left,weight);
            right += weight;
        }

        while (left<right){
            int mid = left+(right-left)/2;

            if(requiredweight(weights , days , mid)){
                right = mid;
            } else {
                left = mid+1;
            }
        }
        return left;
    }
    static boolean requiredweight(int weights[] , int days , int capacity){
        int currentload = 0 ;
        int day = 1 ;
        for (int weight : weights){
            if(currentload + weight <= capacity){
                currentload += weight;
            } else {
                day++;
                currentload = weight;
            }
        }
        return day <= days ;
    }
    public static void main(String[] args) {
int weights[] = {1,2,3,4,5,6,7,8,9,10};
int days = 5 ;
        System.out.println(shippackages(weights,days));
    }
}
