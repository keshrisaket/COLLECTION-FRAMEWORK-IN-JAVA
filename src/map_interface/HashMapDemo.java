package map_interface;

import java.util.*;

public class HashMapDemo {


    public static void main(String[] args){

        // Program : 1

        HashMap myMap=new HashMap();
        myMap.put("100","saket");
        System.out.println(myMap); // [100=saket]
        System.out.println(myMap.put("100","keshri")); // saket

        // Program 2

        HashMap myMap2=new HashMap();
        myMap2.put("chiramjeevi",700);
        myMap2.put("balaiah",800);
        myMap2.put("venkatesh",200);
        myMap2.put("nagarjun",500);

        System.out.println(myMap2); // {chiramjeevi=700, nagarjun=500, balaiah=800, venkatesh=200}

        System.out.println(myMap2.put("chiramjeevi",100)); // 700

        Set s=myMap2.keySet();

        System.out.println(s); // [chiramjeevi, nagarjun, balaiah, venkatesh]

        Collection c=myMap2.values();

        System.out.println(c); // [100, 500, 800, 200]

        Set set=myMap2.entrySet();
        System.out.println(set); // [chiramjeevi=100, nagarjun=500, balaiah=800, venkatesh=200]


        Iterator it=set.iterator();
        while (it.hasNext()){
            Map.Entry m1=(Map.Entry) it.next();
            System.out.println(m1.getKey() + "......." +m1.getValue());

            if (m1.getKey().equals("balaiah")){
                m1.setValue("saket");
            }
        }

        System.out.println(myMap2);  // {chiramjeevi=100, nagarjun=500, balaiah=saket, venkatesh=200}

    }
}
