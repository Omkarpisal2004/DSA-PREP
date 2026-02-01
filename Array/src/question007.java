public class question007 {

    static int moveZeroes(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                arr[i++] = arr[j];
            }
        }
        while (i < arr.length) {
            arr[i++] = 0;
        }
        return i; // returns length of non-zero part (optional)
    }

    public static void main(String[] args) {
        int arr[] = {0, 2, 0, 4, 0, 3, 3, 1};
        moveZeroes(arr);

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
