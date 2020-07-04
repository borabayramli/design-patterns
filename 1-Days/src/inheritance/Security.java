package inheritance;

public class Security extends User {
	
	public Security() {
		super(4000);
	}
	
	@Override
	public void fncName() {
		System.out.println(" Name : Security ");
	}
	
	
	@Override
	public void fncJop() {
		System.out.println("Jop : Security " + price);
	}
	
}