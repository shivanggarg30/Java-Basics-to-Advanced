package ArrayList;
import java.util.ArrayList;

public class Create {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        
        list.add(67);
        list.add(45);
        list.add(56);
        list.add(98);

        System.out.println(list);
        System.out.println(list.contains(56));
        list.set(0,99);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
    }
}
