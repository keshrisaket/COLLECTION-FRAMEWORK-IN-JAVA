package List;

import java.util.Vector;

public class Vector_Demo {
    public static void main(String[] args){


        // Non-Generic Vector
        Vector v=new Vector();
        System.out.println(v.capacity()); //10
        for(int i=1;i<=10;i++){
            v.addElement(i);
        }
        System.out.println(v.capacity()); //10
        v.addElement("A");
        System.out.println(v.capacity()); // 20
        System.out.println(v); // [1,2,3,4,5,6,7,8,9,10,A]
    }
}
