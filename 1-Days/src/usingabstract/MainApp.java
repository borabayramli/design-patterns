package usingabstract;

public class MainApp {

	public static void main(String[] args) {
		
		ActionProduct ac = new ActionProduct();
		ac.productCall("Buzdolabı", 4000);
		ac.sales();
		
		CamProduct cp = new CamProduct();
		cp.productCall("Televizyon", 3000);
		cp.sales();
		
		Product pr = new Product() {
			
			@Override
			public void productCall(String title, int price) {
				super.title = title;
				super.price = price;
				
			}
		};
		pr.productCall("Tablet", 2500);
		pr.sales();

	}

}
