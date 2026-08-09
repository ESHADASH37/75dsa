import java.util.Arrays;
public class longseqnorep {
    public static int lengthoflongestseq(String s){
        if(s == null || s.length() == 0 ) return 0;

        int  [] lastseen = new int [128];
        Arrays.fill(lastseen , -1);

        int maxlen = 0;
        int left = 0;
        for(int right = 0;right < s.length() ; right++){
            char currchar = s.charAt(right);
            if(lastseen[currchar] >= left){
                left = lastseen[currchar]+ 1; 

            }
            lastseen[currchar]= right;
            maxlen = Math.max(maxlen,right - left +1);
        }
        return maxlen;
    }
    public static void main(String args[]){
        String s ="abcabcbb";
        System.out.println("Longest substring length : " + lengthoflongestseq(s));
    }
}
