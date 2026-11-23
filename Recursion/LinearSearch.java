package Recursion;
import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr={2,3,1,4,4,5};
        System.out.println(findTarget(arr,4,0));
        System.out.println(findIndex(arr,4,0));
       // System.out.println(findIndexLast(arr,4,arr.length-1));
       System.out.println(findAllIndex(arr,4,0,new ArrayList<>()));
    
    }
     
    static boolean findTarget(int[] arr, int target, int index){
        if(index==arr.length){
            return false;
        }
        
        return arr[index]==target || findTarget(arr,target,index+1);
    }
 

    static int findIndex(int[] arr, int target, int index){
    
    if(index==arr.length){
    return -1;
    }

    if(arr[index]==target){
    return index;
    }else{
        return findIndex(arr,target,index+1);
    }
    }


    //use this approach
    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index, ArrayList<Integer> list){
          if(index==arr.length){
            return list;
          }
          if(arr[index]==target){
            list.add(index);
          }
            return findAllIndex(arr,target,index+1,list);
          

    }

    static ArrayList<Integer> findAllIndex2(int[] arr,int target,int index){

        ArrayList<Integer> list=new ArrayList<>();

          if(index==arr.length){
            return list;
          }
          //this will contain answer for that function call only
          if(arr[index]==target){
            list.add(index);
          }

          ArrayList<Integer> ansFromBelowCalls =findAllIndex2(arr,target,index+1);
          
           list.addAll(ansFromBelowCalls);

           return list;
    }
   
}
