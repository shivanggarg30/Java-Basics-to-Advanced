package Function;

public class StringReturn {

    public static String greet(){
       
        String greeting = "how are you?";
        return greeting;
    }
    public static void main(String[] args){

        String message = greet();
        System.out.println(message);
    }
}
