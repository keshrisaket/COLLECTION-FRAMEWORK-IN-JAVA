package collection_framework.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class HashSetDemo {
    public static void main(String[] args){


        // HashSet Demo
        Set s=new HashSet();
        s.add("B");
        s.add("C");
        s.add("D");
        s.add("Z");
        s.add(null);
        s.add(10);
        System.out.println(s.add("Z")); // false
        System.out.println(s); // [null, B, C ,Z,10]


        // user define HashSet
        System.out.println("\n");
        Set<Employee> hs=new HashSet<Employee>();

        Employee e1=new Employee(1,"saket","patna");
        Employee e2=new Employee(2,"saket","danapur");
        Employee e3=new Employee(1,"saket","patna");
        Employee e4=new Employee(3,"saket","anand bazar");
        Employee e5=new Employee(4,"saket","danapur");

        System.out.println(e1);
        System.out.println(e2.hashCode());
        System.out.println(e3.hashCode());
        System.out.println(e4.hashCode());
        System.out.println(e5.hashCode());

        System.out.println(e1.equals(e3));

        hs.add(e1);
        hs.add(e2);
        hs.add(e3);
        hs.add(e4);
        hs.add(e5);

        System.out.println(hs);

        Iterator<Employee> it=hs.iterator();
        while (it.hasNext()){
            Employee e=(Employee) it.next();
            System.out.print(e.getId()+" : "+e.getName()+" : "+e.getAddress());
            System.out.print(" , ");
        }


    }
}
