import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if its armstrong number");
        String str= sc.nextLine();
        
        int n = str.length();
        int sum = 0;
       
        for(int i=0;i<n;i++){
               int digit = str.charAt(i) - '0';
               sum += Math.pow(digit, n);
        }
        int k = Integer.parseInt(str);
        if(k == sum){
        System.out.println(sum + " is an armstrong number");
        }
        else{
            System.out.println("Not an armstrong number");
        }

    }
}
