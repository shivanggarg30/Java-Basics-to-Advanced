package SearchingNew;

public class SearchInString {
    public static void main(String[] args){
          String name = "Kunal";
          char target = 'u';
          System.out.println(search(name,target));
    }
    

     static boolean search2(String str,char target){
            if(str.length()==0){
                return false;
            } 
         //to use a for each loop on a string, we need to convert it into a character array
            for(char ch: str.toCharArray()){
                if(ch == target){
                     return true;
                }
            }
            return false;
    }


    static boolean search(String str,char target){
            if(str.length()==0){
                return false;
            } 
 
            for(int i = 0;i<str.length();i++){
                if(str.charAt(i) == target){
                    return true;
                }
            }
            return false;
    }
}
