package SearchingNew;

public class SearchInRange {
   


   public static void main(String[] args){
    int[] nums = {12,23,53,13,6,34,55};
    int target = 13;
    int start =0;
    int end = 2;
    System.out.println("The index is: "+ linearSearch(nums, target,start,end));
   }

    static int linearSearch(int[] arr, int target,int start,int end){
                if(arr.length == 0){
                    return -1;
                }

                for(int i = start;i<=end;i++){
                    if(arr[i] == target){
                        return i;
                    }
                   
                }
                return -1;
    }
}

     
