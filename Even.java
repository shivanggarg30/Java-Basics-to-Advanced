import java.util.Scanner;

public class Even {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if its even or odd");
        int num = sc.nextInt();
         if(num%2==0){
            System.out.println("Number is even");

         }
         else{
            System.out.println("Number is odd");
         }

    }
}
