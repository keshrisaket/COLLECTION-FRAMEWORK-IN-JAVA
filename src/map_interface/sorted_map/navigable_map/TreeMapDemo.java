package map_interface.sorted_map.navigable_map;

import java.util.Comparator;
import java.util.TreeMap;
public class TreeMapDemo {
    public static void main(String[] args){

        TreeMap myMap=new TreeMap();
        myMap.put(100,"AAA");
        myMap.put(103,"BBB");
        myMap.put(101,"CCC");
        myMap.put(104,106);
        myMap.put(107,null);
         // myMap.put("FFF","XXX"); // ClassCastException
         //   myMap.put(null,"XXX"); // NullPointerException

        System.out.println(myMap); // {100=AAA, 101=CCC, 103=BBB, 104=106, 107=null}


        MyComperator myComp=new MyComperator();
        TreeMap mymap=new TreeMap(myComp);
        mymap.put("XXX",340);
        mymap.put("AAA",1045);
        mymap.put("BBB",205);
        mymap.put("SSS",345);
        mymap.put("FFF",40);
        mymap.put("GGG",50);

        System.out.println(mymap); // {AAA=1045, BBB=205, FFF=40, GGG=50, SSS=345, XXX=340}




    }
}

class MyComperator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1=(String) o1;
        String s2=(String) o2;
        return s1.compareTo(s2);
    }
}
