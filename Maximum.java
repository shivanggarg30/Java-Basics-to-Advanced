import java.util.Scanner;

public class Maximum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter a number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter a number 3: ");
        int num3 = sc.nextInt();
         
        int max = num1;

        if(num2>max){
            max = num2;
        }
        if(num3>max){
            max = num3;
        }
        System.out.println(max + " is the greatest number");

    }
}
