package Recursion;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr={1,2,6,4,5,9};
        boolean check = sorted(arr,0);
        System.out.println(check);
    }

    static boolean sorted(int[] arr,int index){

        if(index==arr.length-1){
                return true;
        }
        if(arr[index]<arr[index+1]){
                return sorted(arr,index+1);
        }  
        return false;
        
    }
    /* OR
    static boolean sorted(int[] arr,int index){
    //base condition
    if(index==arr.length-1){
    return true;
    
    }
    return arr[index] < arr[index+1] && sorted(arr,index+1);
    
    }

    */
}
