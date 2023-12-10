public class MyThread extends Thread{


    @Override
    public void run() {
        Singleton singleton = Singleton.GetInstance("Sofiane");

        System.out.println("S1 Soufiane is "+ singleton.value);

        System.out.println(singleton.hashCode() );
    }
}
