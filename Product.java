import java.util.Scanner;
// Subtract the Product and Sum of Digits of an Integer

public class Product{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        int product = 1;
        int sum = 0;
        while(num>0){
            int remainder = num % 10;
            num = num/10;
            product *=remainder;
            sum +=remainder;
        }
        int difference = product - sum;
        System.out.println("The difference between product and sum of an integer: "+ difference);
    }
}