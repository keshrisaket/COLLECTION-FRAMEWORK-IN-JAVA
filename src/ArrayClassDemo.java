import java.util.Arrays;
import java.util.Comparator;

public class ArrayClassDemo {
    public static void main(String[] agrs){
        int[] my;
        my= new int[]{12, 33, 44, 556, 666, 456, 4566, 66 ,8,89,7};
        for (int i:
             my) {
            System.out.print(i+",");
        }

        System.out.println();
        Arrays.sort(my);

        for (int i:
             my) {
            System.out.print(i+"  : ");
        }

        // Problem 2

        String s[]={"saket","kumar","keshri"};
        System.out.println();
       // Arrays.sort(s);
        for (var i:
                s) {
            System.out.print(i+"  : ");
        }

        System.out.println();
        Arrays.sort(s,new MyCom());
        for (var i:
                s) {
            System.out.print(i+"  : ");
        }

        // Searching in Array List

        System.out.println(Arrays.binarySearch(s,"saket")); // 2

        System.out.println(Arrays.binarySearch(s,"keshri",new MyCom())); //0



    }
}

class MyCom implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        String s=(String) o1;
        String t=(String) o2;
        return s.compareTo(t);
    }
}
