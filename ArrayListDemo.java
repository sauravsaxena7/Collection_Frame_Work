import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args){
        System.out.println("LOLA");
        ArrayList l = new ArrayList();
        l.add("A");
        l.add(10);
        l.add("A");
        l.add(null);

        System.out.println(l);

        l.remove(2);
        System.out.println(l);
        l.add(2,"M");
        l.add("n");
        System.out.println(l);


    }
}
