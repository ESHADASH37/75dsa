public class power {
    public static double findpower(double x,int n){
        long N = n;
        if(N < 0){
            x = 1 / x;
            N = -N; 
               }
    
    double result = 1.0;
    double currentproduct = x ;

    while(N >0){
        if(N % 2 == 1){
            result *= currentproduct;
        }
        currentproduct *= currentproduct;
        N /=2;
    }
    return result;
}
public static void main(String args[]){
    System.out.println(findpower(2.00000, 10));
}

    
}
