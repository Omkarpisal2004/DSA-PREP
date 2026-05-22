public class question003 {
    public static void main(String[] args) {
        // max element in array
        int arr [] = {5,3,7,9,1};
        int max = arr[0];
        for(int i = 1 ; i< arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
