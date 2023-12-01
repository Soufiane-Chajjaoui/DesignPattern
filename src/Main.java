public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

//        ++++++++++++++++++++++ Singleton Examples+++++++++++++++++++++++++++++
//
//
//
//
//          Singleton S1 = Singleton.GetInstance("Sofiane");
//          Singleton S2 = Singleton.GetInstance("Mahdi");
//          Singleton S3 = Singleton.GetInstance("Ahmed");
//
//
//            System.out.println("S1 HashCode is "+ S1.hashCode());
//            System.out.println("S2 HashCode is "+ S2.hashCode());
//            System.out.println("S3 HashCode is "+ S3.hashCode());
//
//        System.out.println("S1 HashCode is "+ S1.value);
//        System.out.println("S2 HashCode is "+ S2.value);
//        System.out.println("S3 HashCode is "+ S3.value);
        MyThread2 t2 = new MyThread2();
        MyThread t1 = new MyThread();

        t2.start();
        t1.start();


    }
}