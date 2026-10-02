import java.util.Scanner;

public class ContestTeam {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        int num=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
               int k1 = sc.nextInt();
               
               if(k1==1){
                count++;
               }
               
            }
            
            if(count>2|| count==2){
                  num++;
               }
               count=0;
        }
        System.out.println(num);
    }
}
