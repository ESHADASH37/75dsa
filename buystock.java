public class buystock {
    public static int maxprofit(int[] prices){
        if(prices==null || prices.length<2){
            return 0;
        }
        int minprice=prices[0];
        int maxprice=0;

        for(int i=1;i<prices.length;i++){
            int currentprice=prices[i]-minprice;
            maxprice=Math.max(maxprice,currentprice);
            minprice = Math.min(minprice,prices[i]);
        }
        return maxprice;
    }
    public static void main(String args[]){
        int [] prices={7, 1, 5, 3, 6, 4};
        int profit=maxprofit(prices);

        System.out.println("Maximum profit:"+profit);
    }
    
}
