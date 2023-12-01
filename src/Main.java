public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Hello world!");
        cars c1 = new cars();
        
 
        c1.loadcars();
        System.out.println("++++++++++++++++++++++ before DEEP COPING ++++++++++++++++++++++");
        System.out.println(c1);
        System.out.println(c1.hashCode());
        System.out.println("++++++++++++++++++++++ before DEEP COPING ++++++++++++++++++++++");
        cars c2 = c1.clone();
        System.out.println(c2);
        System.out.println(c2.hashCode());

    }
}