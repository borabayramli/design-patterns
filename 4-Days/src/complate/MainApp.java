package complate;

public class MainApp {

	public static void main(String[] args) {
		
		Runnable rn = () -> {
			Action ac = new Action();
			ac.call();
		};
		new Thread(rn).start();
		
		System.out.println("MainApp Call");

	}

}
