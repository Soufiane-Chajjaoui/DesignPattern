public class Employee {

    private final String Name;
    private final String LastName;
    private final String address ;
    private final int birthday;
    private final int salary;

    private Employee(String name, String lastName, String address, int birthday, int salary) {
        Name = name;
        LastName = lastName;
        this.address = address;
        this.birthday = birthday;
        this.salary = salary;
    }
    public static class BuilderEmployee{
        private String Name;
        private String LastName;
        private String address ;
        private int birthday;
        private int salary;

        public BuilderEmployee setName(String name){
            this.Name = name ;
            return this;
        }

        public BuilderEmployee setLastName(String lastName) {
            LastName = lastName;
            return this;
        }

        public BuilderEmployee setAddress(String address) {
            this.address = address;
            return this;
        }

        public BuilderEmployee setBirthday(int birthday) {
            this.birthday = birthday;
            return this;
        }

        public BuilderEmployee setSalary(int salary) {
            this.salary = salary;
            return this;
        }
        public Employee build(){
            return new Employee(this.Name , this.LastName , this.address , this.birthday , this.salary);
        }


    }
    @Override
    public String toString() {
        return "BuilderEmployee{" +
                "Name='" + Name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", address='" + address + '\'' +
                ", birthday='" + birthday + '\'' +
                ", salary=" + salary +
                '}';
    }
}
