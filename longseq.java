import java.util.HashSet;
import java.util.Set;
public class longseq {
    public static int longestconsecutive(int[] arr){
        if(arr == null || arr.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for(int num :arr){
            set.add(num);
        }
        int maxlen = 0;

        for(int num :set){
            if(!set.contains( num - 1)){
                int currentnum = num;
                int currentstreak = 1;

                while(set.contains(currentnum +1)){
                    currentnum++;
                    currentstreak++;
                }
                maxlen = Math.max(maxlen,currentstreak);
            }
        }
        return maxlen;
    }
    public static void main(String args[]){
        int []  arr ={100, 4, 200, 1, 3, 2};
        System.out.println("Longest streak length : "+ longestconsecutive(arr));
    }
    
}
