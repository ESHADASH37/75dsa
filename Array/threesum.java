import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class threesum {
    public static List<List<Integer>> calculatethreesum(int []  arr){
        List<List<Integer>> result = new ArrayList<>();
        if(arr == null || arr.length < 3) return result;

        Arrays.sort(arr);
        int n  = arr.length;
        for(int i = 0; i< n - 2;i++){
            if(arr[i] > 0)break;
            if(i > 0 && arr[i] == arr[i - 1]) continue;
            int left = i + 1;
            int right = n - 1;

            while(left <right ){
                int sum = arr[i] + arr[left] + arr[right];
                if(sum == 0){
                    result.add(Arrays.asList(arr[i],arr[left],arr[right]));

                    while(left < right && arr[left] == arr[left + 1]) left++ ;
                    while(left < right && arr[right] == arr[right - 1]) right--;
                    left++;
                    right--;

                } 
                else if(sum< 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return result;
    }
    public static void main(String args[]){
        int [] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println("Triplets : " + calculatethreesum(arr));
    }
    
}
