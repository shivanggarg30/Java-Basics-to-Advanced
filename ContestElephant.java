import java.util.Scanner;

public class ContestElephant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int sum=0;
        int count=0;
        for(int i =5;i>0;i--){
           if(x>5){
            x=x-5;
            count++;
           }
           
        }
        System.out.println(count);
    }
}
