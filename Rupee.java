import java.util.Scanner;

public class Rupee {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter some amount in rupees: Rs. ");
        int num = sc.nextInt();

        System.out.printf("The value in dollars is: %.2f ",num/95.61);

    }
}
