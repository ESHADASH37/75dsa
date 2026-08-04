public class repeatandmiss {
    public static int[] findelement(int []  arr){
        long n = arr.length;
        long sn = (n*(n+1))/2;
        long s2n = (n*(n+1) * (2*n+1))/6;

        long s =0;
        long s2 =0;
        for(int num :arr){
            s +=num;
            s2 += (long) num*num;
        }
        long val1 = s - sn;
        long val2 = (s2 - s2n)/val1;

        long x =(val1 + val2) / 2;
        long y = x - val1;

        return new int [] {(int) x, (int) y};
    }
    public static void main(String args[]){
        int [] arr={4, 3, 6, 2, 1, 1};
        int [] result = findelement(arr);
        System.out.println("Reapeating number: " + result[0]);
        System.out.println("Missing number: " + result[1]);
    }
    
}
