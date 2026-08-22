package Function;

public class Overloading {
    public static void main(String[] args) {
        fun(56);
        fun("Rahul");
    }
    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}

