package StringClass;

import java.util.ArrayList;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 453.1274f;
    //    System.out.printf("Formatted number is %.2f",a);

        System.out.printf("Pie: %.3f\n", Math.PI);
        System.out.printf("Hello my name is %s and i am %s\n","Shivang","Cool");
       
        System.out.println((char)('a'+3));

        System.out.println('a'+'c');

         System.out.println("a"+1);
        //integer will be converted to Integer that will call toString()
        //this is same as after a few steps: "a" + "1"

        System.out.println("Kunal"+ new ArrayList<>()); //output will entirely be of string type
        System.out.println("Kunal"+ new Integer(56));
        //new Integer and new ArraList are objects, they will call toString() method
        /* operator + is defined in java only for primitives or 
           when one of the value is defined as string */

       String ans = new Integer(56)+" "+new ArrayList<>();
       System.out.println(ans);
    }
   
}
