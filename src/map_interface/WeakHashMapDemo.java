package map_interface;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args){


        WeakHashMap myMap=new WeakHashMap();
        Integer i1=new Integer(12);
        myMap.put(i1,"saket");
        System.out.println(myMap); // {12=saket}

        i1=null;
        System.out.println(myMap); // {12=saket}

        System.gc();
        try {
            Thread.sleep(100);
        }catch (Exception e){}

        System.out.println(myMap); // {}


    }
}
