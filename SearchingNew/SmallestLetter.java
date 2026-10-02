package SearchingNew;

public class SmallestLetter {
    //return the index: smallest no. >= target
    static int ceiling(int[] arr,int target){

        if(target > arr[arr.length - 1]){
            return -1;
        }
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
        return start;
    }
    public static void main(String[] args) {
        int[] arr= {3,5,7,23,56,78,89};
        int target = 4;
        int result = ceiling(arr,target);
        System.out.println(result);
    }
}

}
