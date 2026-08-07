import java.util.ArrayList;
import java.util.List;
public class majorityitem2 {
    public static List<Integer> majorityelement(int []  arr){
        int candidate1 = 0,candidate2 = 0;
        int count1 = 0,count2 = 0;

        for(int num : arr){
            if(num == candidate1){
                count1++;
            }
            else if(num == candidate2){
                count2++;
            }
            else if(count1 == 0){
                candidate1 = num;
                count1 = 1;
            }
            else if(count2 == 0){
                candidate2 = num;
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for(int num : arr){
            if(num == candidate1) count1++;
            else if(num == candidate2) count2++;

        }
        List<Integer> result = new ArrayList<>();
        int threshould = arr.length / 3;

        if(count1 > threshould) result.add(candidate1);
        if(count2 > threshould) result.add(candidate2);

        return result;
    }
    public static void main(String args[]){
        int [] arr={1, 2, 1, 1, 3, 2, 2};
        System.out.println("Majority elements(>N/3): " + majorityelement(arr));
    }
    
}
