package Pattern;

public class Pattern6 {
    public static void main(String[] args) {
        Pattern(5);
    }

    static void Pattern(int n){
        for(int i=1;i<=n;i++){
            for(int space =0;space<n-i;space++){
               System.out.print("  ");
            }

            for(int j=i;j>=1;j--){
               System.out.print(j + " ");
            }

            for(int j=2;j<=i;j++){
                System.out.print(j + " ");
            }
            
            System.out.println();

        }
    }
}
