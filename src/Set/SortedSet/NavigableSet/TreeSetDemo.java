package Set.SortedSet.NavigableSet;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args)
    {

        TreeSet ts=new TreeSet();
        ts.add("A");
        ts.add("a");
        ts.add("B");
        ts.add("Z");
        ts.add("L");
        //ts.add(Integer.valueOf(10)); //ClassCastException
        // ts.add(null); NullPointerException
        System.out.println(ts);


      /*  ts.add(new StringBuffer("A"));
        ts.add(new StringBuffer("Z"));
        ts.add(new StringBuffer("L"));
        ts.add(new StringBuffer("B"));*/
        System.out.println(ts);


        // Write a program to insert integer object into the tree set
        // where the sorting order is descending order;
        MyComparator mc=new MyComparator();
        TreeSet ts2=new TreeSet(mc);
        ts2.add(12);
        ts2.add(1);
        ts2.add(145);
        ts2.add(123);
        ts2.add(11);
        ts2.add(10);

        System.out.println(ts2);

        // if we are not passing Comparator object then jvm will always calls compa
        // -reTo() method which is meant for default matural sorting order (ascending )
         // order hence in this case the output is descending order



        // write a program to insert String object into the TreeSet where the sorting
        // order is reverse of alphabetical order .
        MyComparatorForStringDecendingOrder mc2=new MyComparatorForStringDecendingOrder();
        TreeSet ts3=new TreeSet(mc2);
        ts3.add("saket");
        ts3.add("kumar");
        ts3.add("keshri");
        System.out.println(ts3);


        // write a program to insert StringBuffer object into the Treeset where the sorting order is alpha
        // -betical order ;
        MyComparator2 mc3=new MyComparator2();
        TreeSet ts4=new TreeSet(mc3);

        ts4.add(new StringBuffer("A"));
        ts4.add(new StringBuffer("Z"));
        ts4.add(new StringBuffer("R"));
        ts4.add(new StringBuffer("A"));
        ts4.add(new StringBuffer("Z"));
        ts4.add(new StringBuffer("G"));


        System.out.println(ts4);

        // wite a program to inset String and StringBuffer objects into the TreeSet where the sorting
        // order is increasing length order . if 2 objects having the same length then consider they
        // alphetical order .
        MyComparator1 m=new MyComparator1();
        TreeSet tsp=new TreeSet(m);

        tsp.add("Q");
        tsp.add(new StringBuffer("QQ"));
        tsp.add(new StringBuffer("AAA"));
        tsp.add(new StringBuffer("qwA"));
        tsp.add(new StringBuffer("ABCD"));
        tsp.add("A");

        System.out.println(tsp);


        // For Predefine non Comparable classes default natural sorting order is not available we can define
        // our own sorting order by using Comparator object .
         Mycompa c=new Mycompa();
        TreeSet<Employee> memp=new TreeSet<Employee>(c);
        memp.add(new Employee(1,"saket","patna"));
        memp.add(new Employee(2,"keshri","danapur"));
        memp.add(new Employee(3,"kumar","anandBazar"));
        memp.add(new Employee(1,"keshri","bhagalpur"));

        System.out.println(memp);








    }



}

class MyComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
       Integer first=(Integer) o1;
       Integer second=(Integer) o2;
       if(first>second){
          return -1;
       }else if(first==second){
           return 0;
       }else {
          return  1;
       }

    }
}

class MyComparatorForStringDecendingOrder implements  Comparator{


    @Override
    public int compare(Object o1, Object o2) {
       String first=(String) o1;
       String second=(String) o2;
       return second.compareTo(first);
    }
}

class MyComparator2 implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        StringBuffer obj1=(StringBuffer) o1;
        StringBuffer obj2=(StringBuffer) o2;

        return obj1.compareTo(obj2);
    }
}

class MyComparator1 implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        String s1=(String) o1.toString();
        String s2=(String) o2.toString();

        if (s1.length()==s2.length()){
            return s1.compareToIgnoreCase(s2);
        }else if (s1.length()>s2.length()){
            return 1;
        }else{
            return -1;
        }
    }
}

class Mycompa implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Employee emp1=(Employee) o1;
        Employee emp2=(Employee) o2;

        String s1=emp1.name();
        String s2=emp2.name();

        return s1.compareToIgnoreCase(s2);


    }
}