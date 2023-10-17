import java.util.Vector;

public class VectorDemo1 {
    public static  void main(String[] args){
        Vector v = new Vector<>(10,5);
        System.out.println("Initial Capacity "+v.capacity());
        for(int i=1;i<=10;i++){
            v.addElement(i);
        }
        System.out.println("Capacity after adding 10 ele "+v.capacity());

        v.addElement("a");

        System.out.println("Capacity after adding 11th ele "+v.capacity());

        System.out.println(v);
    }
}
