public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Employee E1 = new Employee.BuilderEmployee().setName("sofian ").setLastName("chaotic").setBirthday(2003).build();
        System.out.println(E1);
    }
}