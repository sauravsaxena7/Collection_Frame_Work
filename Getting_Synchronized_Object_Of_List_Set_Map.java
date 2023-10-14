import java.util.*;

public class Getting_Synchronized_Object_Of_List_Set_Map {
    public static void main(String[] args){
        ArrayList l = new ArrayList();
        List list = Collections.synchronizedList(l);


        Set s = new HashSet<>();
        Set s1 = Collections.synchronizedSet(s);


        Map m = new HashMap();

        Map m1 = Collections.synchronizedMap(m);


    }
}
