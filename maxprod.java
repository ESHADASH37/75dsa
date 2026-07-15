public class maxprod {
    public static int findmaxprod(int [] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }
        int maxpro = nums[0];
        int minpro = nums[0];
        int globalpro = nums[0];

        for (int i =1;i<nums.length;i++){
            int num = nums[i];

            if(num < 0){
                int temp =maxpro;
                maxpro = minpro;
                minpro = temp; 
            }
            maxpro = Math.max(num,maxpro * num);
            minpro =Math.min(num,minpro * num);

            globalpro = Math.max(globalpro,maxpro);
        }
        return globalpro;
    }
    public static void main(String args[]){
        int [] nums={2, 3, -2, 4, -3};
        int result = findmaxprod(nums);

        System.out.println("Maximum product subarray:"+result);
    }
    
}
