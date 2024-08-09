package map_interface;

import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args){

        Map myMap2=new LinkedHashMap();
        myMap2.put("chiramjeevi",700);
        myMap2.put("balaiah",800);
        myMap2.put("venkatesh",200);
        myMap2.put("nagarjun",500);

        System.out.println(myMap2); // {chiramjeevi=700, balaiah=800, venkatesh=200, nagarjun=500}

        System.out.println(myMap2.put("chiramjeevi",100)); // 700

        Set s=myMap2.keySet();

        System.out.println(s); //  [chiramjeevi, balaiah, venkatesh, nagarjun]

        Collection c=myMap2.values();

        System.out.println(c); // [100, 800, 200, 500]

        Set set=myMap2.entrySet();
        System.out.println(set); // [chiramjeevi=100, balaiah=800, venkatesh=200, nagarjun=500]

        Iterator it=set.iterator();
        while (it.hasNext()){
            Map.Entry m1=(Map.Entry) it.next();
            System.out.println(m1.getKey() + "......." +m1.getValue());

            if (m1.getKey().equals("balaiah")){
                m1.setValue("saket");
            }
        }

        System.out.println(myMap2);  // {chiramjeevi=100, balaiah=saket, venkatesh=200, nagarjun=500}

    }
}
