public class question4 {
    public static void main(String[] args) {
        //min element in array
        int arr [] = {5,74,9,0};
        int min = arr[0];
        for(int i = 1 ; i< arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
