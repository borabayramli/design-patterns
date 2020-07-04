package usingInterface;

public interface IUser {
	
	int number = 30;

	public int fncUserAge();
	public String fncUserName(int id);
	
	// default method
	default public void write() {
		System.out.println("write call");
	}
	
}
