package Sorting;
import java.util.Arrays;

public class InsertionSort {
    
   public static int[] insertion(int[] arr){
            for(int i=0;i<arr.length-1;i++){
              for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }   
              }
            }
     return arr;

   }
    
    static void swap(int[] arr,int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static int getMaxIndex(int[] arr,int start,int end){
        int max=start;
        for(int i=0;i<=end;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={5,3,4,1,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
        }
}

