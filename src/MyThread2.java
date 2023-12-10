public class MyThread2 extends Thread{
    @Override
    public void run() {
        Singleton singleton = Singleton.GetInstance("Ahmed");

        System.out.println("S1 Ahmed is "+ singleton.value);

        System.out.println(singleton.hashCode() );
    }
}
