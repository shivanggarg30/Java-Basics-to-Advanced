package Pattern;

public class Pattern8 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        char current='a';
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(current+" ");
            current++;
        }
        System.out.println();
       }
    }
}
