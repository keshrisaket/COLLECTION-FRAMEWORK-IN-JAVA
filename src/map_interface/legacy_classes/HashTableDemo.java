package map_interface.legacy_classes;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] agrs){

        Hashtable mytable=new Hashtable();
        mytable.put(new Temp(12),"saket");
        mytable.put(new Temp(23),"kumar");
        mytable.put(new Temp(2),"keshri");

        System.out.println(mytable); // {2 ..=keshri, 23 ..=kumar, 12 ..=saket}

        System.out.println(6%10);


    }
}

class Temp {
    int i;
    Temp(int i){
        this.i=i;
    }

    @Override
    public int hashCode() {
        // return i%10 ;
        return i ;
    }

    @Override
    public String toString() {
        return i+" ..";
    }
}
