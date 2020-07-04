package usingabstract;

public abstract class Product {

	String title = "";
	int price = 0;
	
	abstract public void productCall( String title, int price );
	
	public void sales() {
		System.out.println("Sales : " + title + " Price : " + price );
	}
	
	
}
