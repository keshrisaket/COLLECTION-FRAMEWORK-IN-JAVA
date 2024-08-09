package comparable_vs_comparator;

import java.util.Comparator;
import java.util.TreeSet;
class Employee implements Comparable {
    private int s_no;
    private String name;
    private String address;

   public Employee(){
    }

    public Employee(int s_no,String name,String address){
       this.s_no=s_no;
       this.name=name;
       this.address=address;
    }

    public int getS_no(){
       return this.s_no;
    }

    public void setS_no(int s_no){
        this.s_no=s_no;
    }

    public String getName(){
       return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getAddress(){
       return this.address;
    }

    public void setAddress(String  address){
        this.address=address;
    }

    @Override
    public String toString() {
        return  "Emp_sno : "+s_no+" :::: Emp_name : "+name+" :::: Emp_address : "+address;
    }

    @Override
    public int compareTo(Object o) {
       Employee e=(Employee) o;
       int id=e.s_no;
      if(this.s_no==id){
          return 0;
      }else if(this.s_no>id){
          return +1;
      }else {
          return -1;
      }
    }
}

public class CompComp {
    public static void main(String[] args) {

        Employee e1=new Employee(1,"saket","patna");
        Employee e2=new Employee(2,"kumar","danapur");
        Employee e3=new Employee(3,"keshri","anand");
        Employee e4=new Employee(4,"nidhi","bazar");
        Employee e5=new Employee(5,"deepak","cantt");
        Employee e6=new Employee(6,"anish","hatikhana");
        Employee e7=new Employee(7,"raj","gandhi_murti");

        TreeSet<Employee> te1=new TreeSet<>();
        te1.add(e1);
        te1.add(e2);
        te1.add(e3);
        te1.add(e4);
        te1.add(e5);
        te1.add(e6);
        te1.add(e7);

        System.out.println(te1+"\n "); // [[Emp_sno : 1 Emp_name : saket Emp_address : patna, Emp_sno : 2 Emp_name : kumar Emp_address : danapur, Emp_sno : 3 Emp_name : keshri Emp_address : anand, Emp_sno : 4 Emp_name : nidhi Emp_address : bazar, Emp_sno : 5 Emp_name : deepak Emp_address : cantt, Emp_sno : 6 Emp_name : anish Emp_address : hatikhana, Emp_sno : 7 Emp_name : raj Emp_address : gandhi_murti]

        MyComparator c=new MyComparator();
        TreeSet<Employee> ts2=new TreeSet<>(c);
        ts2.add(e1);
        ts2.add(e2);
        ts2.add(e3);
        ts2.add(e4);
        ts2.add(e5);
        ts2.add(e6);
        ts2.add(e7);

        System.out.println(ts2); // [Emp_sno : 7 Emp_name : raj Emp_address : gandhi_murti, Emp_sno : 6 Emp_name : anish Emp_address : hatikhana, Emp_sno : 5 Emp_name : deepak Emp_address : cantt, Emp_sno : 4 Emp_name : nidhi Emp_address : bazar, Emp_sno : 3 Emp_name : keshri Emp_address : anand, Emp_sno : 2 Emp_name : kumar Emp_address : danapur, Emp_sno : 1 Emp_name : saket Emp_address : patna]


    }

}

class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
         Employee e1=(Employee) o1;
         Employee e2=(Employee) o2;

         int s_no_e1=e1.getS_no();
         int s_no_e2=e2.getS_no();

         if(s_no_e1==s_no_e2){
             return 0;
         }else if(s_no_e1<s_no_e2){
             return +1;
         }else{
             return -1;
         }


    }
}
