package Function;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        variableLength(2,5,8,76,45,87,9);
    }
    static void variableLength(int ...v){
      System.out.println(Arrays.toString(v));
    }
}
