package props;

public class User {
	
	public User() {
		System.out.println("User() call");
	}
	
	public User(int i) {
		
	}
	
	private String userName;
	private String userPass;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	
	

}
