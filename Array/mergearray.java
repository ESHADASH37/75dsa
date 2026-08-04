import java.util.Arrays;
public class mergearray {
    public static int[] mergesortedarray(int[] arr1,int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int [] merged = new int[n+m];

        int i =0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(arr1[i] <=arr2[j]){
                merged[k++] = arr1[i++];
            }
            else{
                merged[k++] = arr2[j++];
            }
        }
        while(i<n){
            merged[k++] =arr1[i++];
        }
        while(j<m){
            merged[k++] = arr2[j++];
        }
        return merged;
    }
    public static void main(String[] args) {
        int[] arr1 ={1, 4, 7, 8};
        int [] arr2={2, 3, 9};

        int[] result=mergesortedarray(arr1, arr2);
        System.out.println("Merged Array :" + Arrays.toString(result));
    }
    
}
