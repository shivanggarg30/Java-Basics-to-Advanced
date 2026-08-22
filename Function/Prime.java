package Function;

import java.util.Scanner;
public class Prime {
    static void primeCheck(int n){

        if (n <= 1) {
            System.out.println("Not Prime");
            return;
        }

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        primeCheck(n);
        sc.close();
    }
}
