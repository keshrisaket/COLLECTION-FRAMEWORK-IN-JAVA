package map_interface;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args){
        HashMap m=new HashMap();
        Integer i1=new Integer(10);
        Integer i2=new Integer(10);

        m.put(i1,"saket");
        m.put(i2,"keshri");

        System.out.println(m); // {10=keshri}

        IdentityHashMap myMap=new IdentityHashMap();
        myMap.put(i1,"saket");
        myMap.put(i2,"keshri");

        System.out.println(myMap); // {10=saket, 10=keshri}
    }
}
