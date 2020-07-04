package adapter;

public class AdapterClass extends UserSettings implements IUser {

	@Override
	public void fncUserName() {
		int random = rd.nextInt(90) + 10;
		System.out.println("Random : " + random);
		fncCall();
	}

}
