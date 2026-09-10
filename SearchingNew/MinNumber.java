package SearchingNew;

public class MinNumber {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr = new int[]{2,32,23,54,6};
       System.out.println("Minimum number in. array is: "+ min(arr));
    }

    static int min(int[] arr){
            int min = Integer.MAX_VALUE;
            for(int i=0;i<arr.length;i++){
               if(arr[i] < min){
                min = arr[i];
               }
             }
            return min;
    }

}
