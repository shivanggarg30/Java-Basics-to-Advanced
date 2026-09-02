package SearchingNew;

public class LinearSearch {
    
   public static void main(String[] args){
    int[] nums = {12,23,53,13,6,34,55};
    int target = 13;
    System.out.println("The index is: "+ linearSearch(nums, target));
   }

    static int linearSearch(int[] arr, int target){
                if(arr.length == 0){
                    return -1;
                }

                for(int i = 0;i<arr.length;i++){
                    if(arr[i] == target){
                        return i;
                    }
                   
                }
                return -1;
    }
}
