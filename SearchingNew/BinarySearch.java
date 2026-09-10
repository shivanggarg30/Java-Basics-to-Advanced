package SearchingNew;
 
public class BinarySearch{

    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {-16,-15,-10,-8,3,66,78,89};
        int target =-8;
        int ans = binarySearch(arr,target);
        
        System.out.println(ans);
    }
}