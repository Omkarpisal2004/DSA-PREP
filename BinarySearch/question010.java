package BinarySearch;
// magnetic force between 2 balls
public class question010 {
static int magneticBall(int position[] , int m){
    int left = 1 ;
    int right = position[position.length-1]-position[0];

    while (left<right){
        int mid = left + (right-left +1)/2; //upped mid
        if(space(position , m , mid)){
            left = mid;
        } else right = mid-1;
    }
    return left;
}
static boolean space(int[] position , int m , int mid){
    int ball = 1 ;
    int lastPosition = position[0];
    for (int i = 1 ; i<position.length ; i++){
        if(position[i] - lastPosition >= mid){
            ball++;
            lastPosition = position[i];
        }
    }
    return ball>=m;
}
    public static void main(String[] args) {
int position [] = {1,2,3,4,7};
int m = 3 ;
        System.out.println(magneticBall(position, m));
    }
}
