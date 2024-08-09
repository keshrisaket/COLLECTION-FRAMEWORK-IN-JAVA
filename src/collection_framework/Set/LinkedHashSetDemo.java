package collection_framework.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args){

        LinkedHashSet  lhs=new LinkedHashSet();
        lhs.add("12");
        lhs.add(12);
        lhs.add(12);
        lhs.add(12);
        lhs.add(2);
        lhs.add(1);

        System.out.println(lhs.add("12"));
        System.out.println(lhs);
    }
}
