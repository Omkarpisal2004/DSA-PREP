public class question006 {
    public static void main(String[] args) {
        // odd nums
        int arr [] = {1,2,3,4,5,6,7,8,9,0};
        int count = 0;
        for(int i = 0 ; i< arr.length;i++){
            if(arr[i]%2 != 0){
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("total even number are" +count);
    }
}

