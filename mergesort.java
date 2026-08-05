import java.util.Arrays;
public class mergesort {
    public static void Mergesort(int[] arr,int left,int right){
        if(left>=right)return;
        
        int mid = left + (right -left)/2;
        Mergesort(arr, left, mid);

        Mergesort(arr, mid+1, right);

        merge(arr,left,mid,right);
    }
    private static void merge(int[] arr,int left, int mid,int right){
        int n1=mid -left + 1;
        int n2=right - mid;
        int [] leftarr = new int[n1];
        int [] rightarr = new int[n2];
         for(int i = 0;i<n1;++i) leftarr[i]=arr[left+i];
         for(int j = 0;j<n2;++j) rightarr[j]=arr[mid +1 +j];

         int i =0,j = 0;
         int k = left;
         while(i<n1 && j<n2){
            if(leftarr[i]<=rightarr[j]){
                arr[k++] = leftarr[i++];

            }
            else{
                arr[k++] = rightarr[j++];
            }
         }
         while(i<n1) arr[k++] =  leftarr[i++];
         while(j<n2) arr[k++] = rightarr[j++];

    }
    public static void main(String args[]){
        int [] arr ={38, 27, 43, 3, 9, 82, 10};
        System.out.println("Original :" + Arrays.toString(arr));

        Mergesort(arr, 0,arr.length-1);

        System.out.println("Sorted :  " + Arrays.toString(arr));
    }
}
