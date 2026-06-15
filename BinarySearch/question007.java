package BinarySearch;



// Capacity To Ship Packages Within D Days
public class question007 {
    static int ship(int weight[] , int days){
        int left = 0 ; int right = 0 ;
        for (int ele : weight){
            left = Math.max(left , ele);
            right += ele;
        }
        while (left<right){
            int mid = left + (right-left)/2;
            if(capacity(weight , days , mid)){
                right = mid;
            } else {
                left = mid+1;
            }
        }
        return left;
    }
    static  boolean capacity(int [] weights , int days , int capa){
        int day = 1 ;
        int currload = 0 ;
        for (int ele : weights){
            if(currload + ele > capa){
                day++;
                currload = ele;
            } else {
                currload += ele;
            }
        }
        return day <=days;
    }
    public static void main(String[] args) {
int weight [] = {1,2,3,4,5,6,7,8,9,10};
int days = 5 ;
        System.out.println(ship(weight , days));
    }
}
