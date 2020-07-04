package birdge;

public class BridgeAction {
	
	public void action() {
		
		Envanter defter = new Defter(new UretimImplX());
		callEnvanter(defter);
		
		defter = new Defter(new UretimImplY());
		callEnvanter(defter);
		
		
		Envanter kalem = new Kalem(new UretimImplX());
		callEnvanter(kalem);
		
		kalem = new Kalem(new UretimImplY());
		callEnvanter(kalem);
		
	}
	
	public void callEnvanter( Envanter env ) {
		env.produce();
	}
	

}
