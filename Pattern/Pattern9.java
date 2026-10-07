package Pattern;

public class Pattern9 {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n){
        int count=0;
       for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            char current = (char)('a'+count);

            if(count%2!=0){
                current=(char)(current-32);
            }
            System.out.print(current+" ");
            count++;
        }
        System.out.println();
       }
    }
}
