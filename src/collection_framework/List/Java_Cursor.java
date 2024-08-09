package collection_framework.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Java_Cursor {

    public static void main(String[] args){

        // Java Cursors
      /*  1. Enumeration
        2. Iterator
        3. ListIterator  */

        // Enumeration

        Vector v=new Vector();
        v.add("a");
        v.add(2);
        v.add(3);
        v.add(45);
        v.add("saket");
        v.add("keshri");

        Enumeration e=v.elements();
        while (e.hasMoreElements()){
            Object o=(Object) e.nextElement();
            System.out.print(o+" ,");
        }


        System.out.println("\n");
        // Iterator
        Iterator i=v.iterator();
        while (i.hasNext()){
            Object o=(Object) i.next();
            System.out.print(o+" ,");
        }


        System.out.println("\n");
        // ListIterator
        ListIterator li=v.listIterator();
        while (li.hasNext()){
            Object o=(Object) li.next();
            System.out.print(o+" ");
        }

        System.out.println("\n");
        // In reversed order Printing
        System.out.println("Traversal in reverser order ");
        while (li.hasPrevious()){
            Object o=(Object) li.previous();
            System.out.print(o+" ");
        }



    }

}
