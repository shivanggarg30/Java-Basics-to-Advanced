package Recursion;

public class Factorial {
    public static void main(String[] args) {
        int product = fact(0);
        System.out.println(product);
    }

    static int fact(int n){
        if(n <= 1){
            return 1;
        }


    return n * fact(n-1);
    }
}
