package SimpleExemple;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// 		Singleton obj1 = Singleton.getInstance("soufian");
// 		
//
// 		System.out.println(obj1.hashCode());
// 		
// 		Singleton obj2 = Singleton.getInstance("kawtar");
//
// 		System.out.println(obj2.hashCode());		

		
		new Thread( ()->{
			Singleton obj3 = Singleton.getInstance("Mahdi");
			System.out.println(obj3.hashCode());
		}).start();
		
		new Thread( ()->{
			
			Singleton obj4 = Singleton.getInstance("Ahmed");
			System.out.println(obj4.hashCode());

		}).start();
	}

}
