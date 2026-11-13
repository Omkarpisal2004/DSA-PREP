package Revision;

public class largest_element {
    static int largestelement(int arr[] ){
        int max = arr[0];
        for (int i = 1 ; i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {3, 8, 1, 15, 7};
        System.out.println(largestelement(arr));
    }
}
