import java.util.HashSet;
public class duplicate {
    public static boolean containduplicate(int[]nums){
        if(nums==null || nums.length<2){
            return false;
        }
        HashSet<Integer> seen = new HashSet<>();
        for(int num:nums){
        if(seen.contains(num)){
            return true;

        }
        seen.add(num);
    }
    return false;
    }
    public static void main(String[] args) {
        int [] arr1 ={1,2,3,1};
        int [] arr2 ={1,2,3,4,5};
        
        System.out.println("Array 1 contains duplicate ?"+containduplicate(arr1));
        System.out.println("Array 1 contains duplicate ?"+containduplicate(arr2));
    }
    
}
