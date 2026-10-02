package Sorting;
import java.util.Arrays;
public class BubbleSort {

    public static int[] bubble(int[] arr){
       
        for(int j=0;j<arr.length-1;j++){
        for(int i=0;i<arr.length-j-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;

            }
        }
    }


        return arr;
    }
    public static void main(String[] args){
        int[] arr = {3,6,1,8,2};
       System.out.println(Arrays.toString(bubble(arr)));
    }
}
