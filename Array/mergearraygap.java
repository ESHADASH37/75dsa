import java.util.Arrays;
public class mergearraygap {
    public static void merge(int[] arr1,int [] arr2,int n,int m){
        int len = n + m;
        int gap = (len/2)+(len%2);

        while(gap>0){
            int left =0;
            int right =left+gap;

            while(right<left){
                if(left<n && right>=n){
                    swap(arr1,arr2,left,right -n);
                }
                else if(left >= n){
                    swap(arr2,arr2,left -n,right - n);

                }
                else{
                    swap(arr1,arr1,left,right);
                }
                left++;
                right++;
            }
            if(gap == 1) break;
            gap =(gap/2)+(gap%2);
        }
    }
    private static void swap(int [] a1,int[] a2,int ind1,int ind2){
        if(a1[ind1]>a2[ind2]){
            int temp =a1[ind1];
            a1[ind1] =a2[ind2];
            a2[ind2] = temp;
        }
    }
    public static void main(String args[]){
        int [] arr1 = {1, 4, 8};
        int [] arr2 ={2, 3, 9};

        merge(arr1,arr2,arr1.length,arr2.length);

        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
    }
    
}
