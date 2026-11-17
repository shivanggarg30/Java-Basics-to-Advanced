package Recursion;

public class CountZeroes {
    public static void main(String[] args) {
        Count(20202);
        System.out.println(count);
    }
   static int count=0;
    static void Count(int n){
       if(n==0){
        return;
       }
       int rem=n%10;
       if(rem==0){
        count++;
       }

       Count(n/10);
    }
}
