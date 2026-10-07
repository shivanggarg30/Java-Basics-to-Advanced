package Pattern;

public class Pattern7 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        for(int i=n;i>=1;i--){
            for(int j=i;j<=n;j++){
                char letter=(char)('A'+j-1);
                System.out.print(letter+" ");
            }
            System.out.println();
            
        }
    }
}
