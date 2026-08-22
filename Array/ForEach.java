package Array;
import java.util.Scanner;


public class ForEach {
    public static void main(StringArray[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i<arr.length;i++){
            System.out.printf("Enter number %d: ",i+1);
               arr[i] = sc.nextInt();
        }

        for(int num: arr){
            System.out.println(num+" ");  //here num represents element of the array
        }

    }
}
