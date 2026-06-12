package BinarySearch;
//kth smallest in sorted matrix

public class question004 {
    static int count(int [][] matrix , int mid){
        int n = matrix.length;
        int count = 0;
        int row = n-1;
        int col = 0;

        while (row >=0 && col < n ){
            if(matrix[row][col] <= mid){
                count += row+1;
                col++;
            } else row--;
        }
        return count;
    }

    static int smallest (int [][] matrix , int target){
        int n = matrix.length;
        int left = matrix[0][0];
        int right = matrix[n-1][n-1];

        while (left<right){
            int mid = left +(right-left)/2;
            if(count(matrix , mid) < target){
                left = mid+1;
            } else right = mid;
        }
        return left;
    }
    public static void main(String[] args) {
        int matrix[][] =  {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
        };
        int target = 8 ;
        System.out.println(smallest(matrix , target));

    }
}
