package usingabstract;

public class ActionProduct extends Product {

	@Override
	public void productCall(String title, int price) {
		super.title = title;
		super.price = price;
	}
	
	

}
