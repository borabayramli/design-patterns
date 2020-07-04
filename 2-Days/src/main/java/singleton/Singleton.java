package singleton;

public class Singleton {

	private static Singleton instance = null;
	
	private static Object lock = new Object();
	
	private Singleton() {
		System.out.println("Singleton init() ");
	}
	
	public static Singleton instance() {
		if (instance == null) {
			synchronized (lock) {
				if (instance ==  null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
	
	public void write( int i ) {
		System.out.println("Write call " + i);
	}
	
	
}
