package factory;

public class Test {

	public static void main(String[] args) {

		ArabaFabrika bwm = new BwmFabrikasi();
		ArabaFabrika audi = new AudiFabrika();
				
		dataResult(bwm);
		dataResult(audi);

	}
	
	
	public static void dataResult( ArabaFabrika ar ) {
		for ( final Araba item : ar.getArabaListesi() ) {
			System.out.println(item.getMarka() + " " + item.getModel() + " " + item.getBeygirGucu());
		}
	}

}
