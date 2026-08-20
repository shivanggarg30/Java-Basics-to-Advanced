package Function;

public class Argument {
    
    static int sum(int a, int b){
        int sum = a+b;
        return sum;
         
    }

     public static void main(String[] args){
        int ans = sum(20,30);
        System.out.println("Sum is: "+ ans);
     }
}
