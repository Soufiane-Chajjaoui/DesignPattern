package SimpleExemple;

public class Singleton {
	
	public static volatile Singleton instance =  null;
	public  String val ;
	private Singleton(String v) {
		this.val = v ;
	}
	
	public static Singleton getInstance(String name) {
		
		// Synchronize access to this block to ensure that only one thread can execute it at a time
		synchronized (Singleton.class) { 
			
			// and you can Add Thread.sleep(Unit-mileSecond)
			
			if (instance == null) { // check instance Singleton if not exist
				
				instance = new Singleton(name) ;
				
				return instance ;
				
			}else 
				return instance ;
		} 
	}
}
