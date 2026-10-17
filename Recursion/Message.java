package Recursion;

public class Message {
      
public static void main(String[] args){
     message1(1); 
}

  //function calling another function
static void message1(int n){
System.out.println(n);
message2(2);
}

static void message2(int n){
System.out.println(n);
message3(3);
}

static void message3(int n){
System.out.println(n);
message4(4);
}

static void message4(int n){
System.out.println(n);
message5(5);
}

static void message5(int n){
System.out.println(n);
}

}
