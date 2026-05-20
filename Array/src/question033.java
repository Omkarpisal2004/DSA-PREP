// Second Largest element
public class question033 {
    static int secondLargest(int [] arr){
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;

        for(int i = 1 ; i< arr.length;i++){
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
int arr[] = {10,10,4};
        System.out.println(secondLargest(arr));
        ;
    }
}
