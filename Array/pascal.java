public class pascal {
    public static long getpascalelement(int r, int c){
        int n=r - 1;
        int k=c - 1;
        long result = 1;

        for(int i=0;i < k;i++){
            result=result*(n-i);
            result=result/(i+1);
        }
        return result;
    }
    public static  void main(String args[]){
        int row = 5, col = 3;
        System.out.println("element at row " + row +" , Column "+ col +" is : "+getpascalelement(row,col));

    }
    
}
