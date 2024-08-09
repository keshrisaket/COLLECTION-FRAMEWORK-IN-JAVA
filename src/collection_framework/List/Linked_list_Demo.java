package collection_framework.List;

import java.util.LinkedList;

public class Linked_list_Demo {

    public static void main(String[] args){


        // Non-Generic LinkedList
        LinkedList ll=new LinkedList();
        ll.add("ashok");
        ll.add(30);
        ll.add(null);
        ll.add("ashok");
        System.out.println(ll); // [ashok, 30, null, ashok]
        ll.set(0,"software");
        System.out.println(ll); // [software,30,null,ashok]
        ll.set(0,"venky");
        System.out.println(ll); // [venky,30,null,ashok]
        ll.removeLast();
        System.out.println(ll); // [venky,30,null]
        ll.addFirst("vvv");
        System.out.println(ll); // [vvv,venky,30,null]
    }


}
