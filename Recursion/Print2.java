package Recursion;
// when you are emptying the stack then only print
public class Print2 {
    public static void main(String[] args) {
        print1toN(5);
    }

    static void print1toN(int n){
        if(n==0){
            return;
        } 

        print1toN(n-1);
        System.out.println(n);
    }
}
