package BinarySearch;
//Minimum Number of Days to Make m Bouquets
public class question008 {
    static int boquet(int bloomDay[] , int m , int k){
        if((long)m*k > bloomDay.length){
            return -1;
        }
        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;
        for (int ele : bloomDay){
            left = Math.min(left,ele);
            right = Math.max(right,ele);
        }
        while (left<right){
            int mid = left +(right-left)/2;

            if(minDay(bloomDay , m , k , mid)){
                right = mid;
            } else left = mid+1;
        }
        return left;
    }
    static boolean minDay(int[] bloomDay , int m , int k ,int day){
        int flower = 0 ;
        int bouqet = 0 ;
        for (int ele : bloomDay){
            if(ele <= day){
                flower++;
                if(flower == k){
                    bouqet++;
                    flower = 0;
                }
            } else flower = 0 ;
        }
        return  bouqet>=m;

    }
    public static void main(String[] args) {
     int bloonDay[] = {1,10,3,10,2};
     int m = 3 ; int k = 1 ;
        System.out.println(boquet(bloonDay,m,k));
    }
}
