import java.util.Scanner;

public class Leap {
    
   static int leapYear(int year){
         if(year % 4 == 0 && year % 100 != 0 || year %400==0){
            System.out.println("It is a leap year");
            
         }
         else{
            System.out.println("Not a leap year");
         }
         return 0;
    }

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a year: ");
    int year = sc.nextInt();
    leapYear(year);
   
    }
}
