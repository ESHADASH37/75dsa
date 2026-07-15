public class twosum{
    public static boolean twosumsorted(int []arr,int target){
        int left = 0;
        int right = arr.length - 1;

        while(left<right){
            int currentsum = arr[left]+arr[right];

        if(currentsum ==target) {
            return true;
        }else if(currentsum<target){
            left++;
        }else{
            right--;
        }
    }
    return false;
    }
    public static void main(String[] args) {
        int [] arr ={2, 7, 11, 15};
        int target =18;
        System.out.println("Pair exists? "+twosumsorted(arr,target));

    }
}
