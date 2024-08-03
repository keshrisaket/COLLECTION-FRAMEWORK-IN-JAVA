package Set;

public class Employee {

        private int id;
        private String name;
        private String address;

        public Employee(){

        }

        public Employee(int id,String name,String address){
            this.id=id;
            this.name=name;
            this.address=address;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

    @Override
    public int hashCode() {
        return this.id*10;
    }

    @Override
    public String toString() {

        return this.id+": "+ this.name+": "+this.address+" ";
    }

    @Override
    public boolean equals(Object obj) {
            Employee e=(Employee) obj;
            if (e.getId()==this.id){
                return true;
            }else{
                return false;
            }
    }
}
