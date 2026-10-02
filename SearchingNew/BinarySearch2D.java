package SearchingNew;

import java.util.Arrays;

public class BinarySearch2D {
    static int[] search(int[][] arr,int target){
int r=0;
int c=arr.length-1;

while(r<arr.length && c>=0){

    if(arr[r][c]==target){ 
        return new int[]{r,c};
    }
    if(arr[r][c]<target){
        r++;
    }else{
        c--;
    }
    
}
return new int[]{-1,-1};
    }

    public static void main(String[] args){
    int[][] arr= {{10,20,30,40},{11,25,35,45},{28,29,37,49},{33,34,38,50}};
    int target = 25;
    int[] result = search(arr, target);
    System.out.println(Arrays.toString(result));
    
}
}
