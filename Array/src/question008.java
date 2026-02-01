import java.util.Arrays;

public class question008 {

    static int removeElement(int arr[], int ele) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != ele) {
                arr[i++] = arr[j];
            }
        }
        return i; // new length
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 5, 2, 8, 2};
        int ele = 2;

        int newLength = removeElement(arr, ele);
//        for(int i = 0 ; i<newLength;i++){
//            System.out.print(arr[i] + " ");
//        }
        int[] result = Arrays.copyOf(arr,newLength);
        System.out.println(Arrays.toString(result));
    }
}
