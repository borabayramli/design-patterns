package inheritance;

public class User {
	
	int price = 1000;
	
	public User() {
		System.out.println("User() call");
	}
	
	public User(int price) {
		this.price = price;
	}
	// name
	// jop
	
	public void fncName() {
		System.out.println("Name : User ");
	}
	
	public void fncJop() {
		System.out.println("Jop : User " + price);
	}

	
	// admin
	// operator
	// security

}
