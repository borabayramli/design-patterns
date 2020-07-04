package usingInterface;

public class UserClass implements IUser, IUserPhoto {

	@Override
	public int fncUserAge() {
		write();
		return 18;
	}

	
	@Override
	public String fncUserPhoto(int w, int h) {
		String st = "";
		if (w == 100) {
			st = "a.jpg";
		}else {
			st = "b.jpg";
		}
		return st;
	}


	@Override
	public String fncUserName(int id) {
		String name = "";
		if (id == 10)
		{
			// number = 40;
			name = "Ali Bilmem " + number;
		}
		return name;
	}

	
	
}
