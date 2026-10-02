import java.util.Scanner;

public class ContestBalloons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t = sc.nextInt();
        
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
           String s=sc.next();
           int sum=0;
           for(int j='A';j<='Z';j++){
            int count=0;
               for(int k=0;k<s.length();k++){
                if(j==s.charAt(k)){
                    count++;
                }
               }
               
               if(count>0){
            sum+=count+1;
           }
           }
           
           System.out.println(sum);
           

        }
        
      
    }
}
