package collection_framework.Set.SortedSet.NavigableSet;

public class Employee implements  Comparable{
    private int id;
    private String name;
    private String address;

    public Employee(int id , String name, String address){
        this.id=id;
        this.name=name;
        this.address=address;

    }

    public Employee(){

    }


    public int id() {
        return id;
    }

    public Employee setId(int id) {
        this.id = id;
        return this;
    }

    public String name() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public String address() {
        return address;
    }

    public Employee setAddress(String address) {
        this.address = address;
        return this;
    }


    @Override
    public int compareTo(Object o) {
        Employee emp=(Employee) o;
         if(this.id==emp.id){
             return 0;
         }else if(this.id>emp.id) {
             return 1;
         }else {
             return -1;
         }
    }

    @Override
    public String toString() {

        return " id : "+id+" name : "+name+" address : "+address;
    }
}
