import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList l = new LinkedList();
        l.add("saurav");
        l.add(30);
        l.add(null);
        l.add("saurav");
        l.set(0,"saurav suman");
        l.add(0,"saroj");
        l.add(0,"gaurav");
        l.removeLast();
        l.add("ccc");
        System.out.println(l);
    }
}
