package SearchingNew;

public class Floor {
    //return the index: greatest no. <= target
    static int floor(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
              int mid = start + (end-start)/2;

              if(arr[mid]==target){
                return mid;
              }
              else if(arr[mid]>target){
                end = mid -1;
              }
              else{
                start = mid+1;
              }

        }
        return end;
    }
    public static void main(String[] args) {
        int[] arr= {3,5,7,23,56,78,89};
        int target = 4;
        int result = floor(arr,target);
        System.out.println(result);
    }
}


