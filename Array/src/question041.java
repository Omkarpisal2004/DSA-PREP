import java.util.Arrays;
// Boats to save people
public class question041 {
    static int boatToSavePeople(int people[] , int limit){
        int left = 0 ; int right = people.length-1;
        int boat = 0;
        Arrays.sort(people);
        while (left<=right){
            if(people[left] + people[right] > limit){
                right--;
                boat++;
            } else {  // (people[left]+people[right] <= limit
                left++;
                right--;
                boat++;
            }
        }
        return boat;
    }
    public static void main(String[] args) {
int people[] = {3,5,3,4};
int limit = 5 ;
        System.out.println(boatToSavePeople(people,limit));
    }
}
