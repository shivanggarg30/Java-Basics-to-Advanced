package StringClass;

public class Palindrome {
    static boolean Check(String alphabet){
  
if(alphabet.length()==0||alphabet==null){
    return true;
}
for(int i=0;i<=alphabet.length()/2;i++){
    int start=alphabet.charAt(i);
    int end=alphabet.charAt(alphabet.length()-1-i);
       if(start!=end){
        return false;
       }
    }
 
    return true;
}
public static void main(String[] args) {
    String alphabet="abcdcba";
    String alpha = alphabet.toLowerCase();
    
    boolean ans=Check(alpha);
    System.out.println(ans);
}
}
