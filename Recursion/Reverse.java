package Recursion;

public class Reverse {
    public static void main(String[] args) {
        reverse1(1342);
        System.out.println(sum);
        System.out.println("Is it a palindrome? : " + palindrome(22));
    }
    static int sum = 0;

    static void reverse1(int n){
         if(n==0) return;

         int rem=n%10;

         sum = sum*10 + rem;
         reverse1(n/10);
    }
 
    static int helper(int n,int currentSum){
        if(n==0) return currentSum;

        return helper(n/10,currentSum*10 + (n%10));
    }

    static boolean palindrome(int n){
        return n==helper(n,0);
    }
}
