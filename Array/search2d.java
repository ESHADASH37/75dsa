public class search2d {
    public static boolean search2dmatrix(int [][] matrix ,int target){
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)return false;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int low = 0;
        int high =(rows * cols) - 1;
        while(low <= high){
            int mid = low +(high - low) / 2;
            int midval=matrix[mid / cols][mid % cols];
            if(midval == target){
                return true;

            }
            else if(midval < target){
                low =  mid +1;
            }
            else{
                high = mid - 1;
            }
        } 
        return false;
    }
    public static void main(String[] args) {
        int [] [] matrix ={
            {1,   3,  5,  7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        System.out.println(search2dmatrix(matrix,8));
    }
    
}
