public class Singleton {
    public String value ;
    private volatile static Singleton instance ;
    public static  Singleton GetInstance(String val){ // synchronized is bad solution it decrease 100 from performance
         if (instance == null) {
             synchronized(Singleton.class) {
                 if (instance == null) {
                     instance = new Singleton(val);
                 }
             }
        }
        return instance;
    }
    private Singleton(String val){
        this.value = val;
    }
 }
