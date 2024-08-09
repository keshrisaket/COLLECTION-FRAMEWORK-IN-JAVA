import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {

    public static void main(String[] args){
        ArrayList mylist=new ArrayList();
        mylist.add("z");
        mylist.add("a");
        mylist.add("c");
        mylist.add("d");
       // mylist.add(new Integer(23));
        System.out.println(mylist); // [z, a, c, d]

      //  Collections.sort(mylist);
        System.out.println(mylist); // [a, c, d, z]

        // Problem 2

        MyComperator mycom=new MyComperator();

        Collections.sort(mylist,mycom);

        System.out.println(mylist); // [z, d, c, a]

        System.out.println(Collections.binarySearch(mylist,"ac")); // -2
        System.out.println(Collections.binarySearch(mylist,"c")); //   1

        Collections.reverse(mylist);
        System.out.println(mylist);
    }
}

class MyComperator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
         String i=(String) o1;
         String  j=(String) o2;
         return i.compareTo(j);

    }
}
