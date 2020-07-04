package inheritance;

public class Admin extends User {
	
	public Admin() {
		super(10000);
	}
	
	@Override
	public void fncName() {
		System.out.println(" Name : Admin ");
	}
	
	
	@Override
	public void fncJop() {
		System.out.println("Jop : Admin " + price);
	}
	
	
	public void fncMeeting() {
		System.out.println("Admin fncMeeting Call");
	}
	
	
}
