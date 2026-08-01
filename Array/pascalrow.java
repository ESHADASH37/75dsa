import java.util.ArrayList;
import java.util.List;
public class pascalrow {
    public static List<Long> getrow(int r){
        List<Long> rowlist = new ArrayList<>();
        long ans = 1;
        rowlist.add(ans);
        int n = r -1;

        for(int i = 1;i<=n;i++){
            ans=ans *(n-i+1);
            ans=ans/i;
            rowlist.add(ans);
        }
        return rowlist;

    }
    public static void main(String args[]){
        int row = 5;
        System.out.println("Row "+ row +" of pascal's triangle is :");
        System.out.println(getrow(row));
    }
    
}
