package usingabstract;

public class CamProduct extends Product {

	@Override
	public void productCall(String title, int price) {
		super.title = title;
		super.price = price - 10;
	}
	
}
