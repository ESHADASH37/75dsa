import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class merge {
    public static int[][] mergeintervals(int [] [] intervals){
        int n = intervals.length;
        boolean []  visited = new boolean[n];
        List<int[]> result = new ArrayList<>();

        for(int i = 0;i<n;i++ ){
            if(visited[i]) continue;

            int start = intervals[i][0];
            int end = intervals[i][1];
            visited[i] = true;
            boolean mergedAny;
            do{
                mergedAny = false;
                for(int j = 0;j<n;j++){
                    if(!visited[j]){
                        int nextstart=intervals[j][0];
                        int nextend = intervals[j][1];

                        if(Math.max(start,nextstart)<=Math.min(end,nextend)){
                            start=Math.min(start,nextstart);
                            end=Math.max(end,nextend);
                            visited[j]=true;
                            mergedAny=true;
                        }
                        
                    }
                }
            }
            while(mergedAny);
            result.add(new int[]{start,end});

        }
        return result.toArray(new int[result.size()][]);
    }
    public static void main(String[] args) {
        int [] [] intervals={{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        int [] [] merged=mergeintervals(intervals);
        System.out.println("Merged intervals:");
        for(int[]interval:merged){
            System.out.println(Arrays.toString(interval));
        }

    }

    
}
