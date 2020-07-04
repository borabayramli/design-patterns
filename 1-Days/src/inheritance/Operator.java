package inheritance;

public class Operator extends User {
	
	public Operator() {
		super(3000);
	}
	
	@Override
	public void fncName() {
		System.out.println(" Name : Operator ");
	}
	
	
	@Override
	public void fncJop() {
		System.out.println("Jop : Operator " + price);
	}
	
}
