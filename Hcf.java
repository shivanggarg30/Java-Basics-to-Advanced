import java.util.Scanner;

public class Hcf {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number: ");
     int input1 = sc.nextInt();
    System.out.println("Enter first number: ");
    int input2 = sc.nextInt();
   
    
    while(input2!=0){
        int temp = input2;
        input2 = input1%input2;
        input1 = temp;
    }
    System.out.println(input1);
    }
}
