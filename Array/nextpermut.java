import java.util.Arrays;
public class nextpermut {
    public static void nextpermutation(int [] nums){
        if(nums == null || nums.length <= 1){
            return ;
        }
        int n=nums.length;
        int i=n-2;

        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }

        if(i>=0){
            int j=n-1;
            while(nums[j]<=nums[i]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,n-1);
    }
    private static void swap(int []  nums,int i,int j){
        int temp = nums[i];
        nums[j]=nums[i];
        nums[i]=temp;
    }
    private static void reverse(int [] nums ,int start,int end){
        while(start<end){
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int[] nums={2, 1, 5, 4, 3};
        nextpermutation(nums);
        System.out.println("Next permutation: " +Arrays.toString(nums));
    }
    
}
