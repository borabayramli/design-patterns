package inheritance;

public class MainApp {
	
	public static void main(String[] args) {
		
		Admin adm = new Admin();
		Operator opr = new Operator();
		Security scr = new Security();
		
		fncCall(adm);
		fncCall(opr);
		fncCall(scr);

	}
	
	
	public static void fncCall( User us ) {
		us.fncName();
		us.fncJop();
		
		if ( us instanceof Admin ) {
			Admin adm = (Admin) us;
			adm.fncMeeting();
		}
		
	}
	
	

}
