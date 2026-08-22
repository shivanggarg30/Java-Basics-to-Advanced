package Array;
import java.util.Scanner;
import java.util.Arrays;
public class Array2D {
    public static void main(String[] args) {
        /* 
        1 2 3
        4 5 6
        7 8 9
         */

     /* int[][] arr = new int[3][3];

      arr[0][0]=1;
      arr[0][1]=2;
      arr[0][2]=3;
      arr[1 ][0]=4;
      arr[1][1]=5;
      arr[1][2]=6;
      arr[2][0]=7;
      arr[2][1]=8;
      arr[2][2]=9;
      */
Scanner sc = new Scanner(System.in);
      int [][] arr = new int[3][2];
       
      for(int row = 0;row<arr.length;row++){
 
        for(int col = 0;col<arr[row].length;col++){
            arr[row][col]=sc.nextInt();
        }
      }

/*for(int row = 0;row<arr.length;row++){
 
        for(int col = 0;col<arr[row].length;col++){
            System.out.print(arr[row][col]+" ");
        }
        System.out.println("");
      }

       
    */

  /*  for(int row = 0;row<arr.length;row++){

        System.out.println(Arrays.toString(arr[row]));
      }
    
    */

      for(int[] a:arr){
        System.out.println(Arrays.toString(a));
      }
    
    }
}
