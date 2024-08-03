package List;

import java.util.*;

public class ArrayListDemo {


    public static void main(String[] args) {

        // Non-Generic ArrayList
        ArrayList<String> one=new ArrayList<>();

        one.add("saket");
        System.out.println(one);
        System.out.println(one.get(0));
        one.add(1,"kumar");
        System.out.println(one);
        one.set(1,"keshri");
        System.out.println(one);
        one.add(1,"ram");
        System.out.println(one);
        System.out.println(one.isEmpty());
        System.out.println(one.size());
        // Removes all the elements of list
       // one.clear();
        //System.out.println(one);

        Object obj=one.clone();
        System.out.println(obj.getClass());
        ArrayList<String> mylist= (ArrayList<String>) obj;
        System.out.println(mylist);


        // Iteration in ArrayList
        /*  1. for loop
          2. for each-loop
          3. Iterator
          4. ListIterator
          5. Enumeration (Legacy collection)
*/

        // for loop
        System.out.println("\n with for loop");
        for(int i=0;i<one.size();i++){
            System.out.print(one.get(i)+" ");
        }

        // for each loop
        System.out.println("\n with for each loop");
        for (String i:one) {
            System.out.print(i+" ");
        }

        //  with Iterator
        System.out.println("\n with iterator ");
        Iterator<String> myitr=one.iterator();
        while (myitr.hasNext()){
            System.out.print(myitr.next()+" ");
        }

        // with ListIterator

        System.out.println("\n with ListIterator ");
        ListIterator<String> myListItr=one.listIterator();
        // forword order traversal
        while (myListItr.hasNext()){
            System.out.print(myListItr.next()+" ");
        }

        // backward order traversal
        System.out.println();
        while (myListItr.hasPrevious()){
            System.out.print(myListItr.previous()+" ");
        }

        // with Lambda expression
        System.out.println("\n Traversal with Lambda Expression ");
        one.forEach((i)-> System.out.print(i+" "));

        System.out.println("This method is use to clear all items in list ");
        one.clear();
        System.out.println(one);

        Vector vc=new Vector();

        vc.add("saket");
        vc.add("kumaar");
        vc.set(1,"kumar");
        System.out.println(vc.get(1));
        System.out.println(vc);

        System.out.println("\n Printing the elements of vecotor with enumeration");
           Enumeration en= vc.elements();
           while (en.hasMoreElements()){
               System.out.print(en.nextElement()+" ");
           }

        System.out.println("\n \n \n");
        // Generic ArrayList
        ArrayList two=new ArrayList();
        two.add("A");
        two.add(10);
        two.add("A");
        two.add(null);
        System.out.println(two); // [A,10,A,null]
        two.remove(2);
        System.out.println(two); // [A,10,null]
        two.add(2,"m");
        System.out.println(two); // [A,10,m,null]
        two.add("n");
        System.out.println(two); // [A,10,m,null,n]
    }
}