package Revision;

public class koko_eating_banana {
    static int kokoo(int pile[] , int hours){
        int left = 1 ; int right = 0;
        for (int piles : pile){
            right = Math.max(right,piles);
        }

        while (left < right){
            int mid = left+(right-left)/2 ;

            if(timee(pile,hours,mid )){
                right = mid;
            } else {
                left = mid+1;
            }
        }
        return left;
    }
    static boolean timee(int piles[] , int hours , int speed){
        int totalhours = 0 ;
        for (int pile : piles){
            totalhours += (pile + speed-1)/speed;
        }
        if (totalhours > hours){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
int piles[] = {3, 6, 7, 11};
int hours = 8 ;
        System.out.println("the min speed required to complete the piles of banana :" + kokoo(piles,hours));
    }
}
