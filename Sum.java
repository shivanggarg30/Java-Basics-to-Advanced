import java.util.Scanner;

public class Sum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 20");
        int input = sc.nextInt();
        for(int i = 1; i<=10; i++){
        System.out.printf("%d x %d = %d\n",input,i, input * i);
    
    }
}
}
