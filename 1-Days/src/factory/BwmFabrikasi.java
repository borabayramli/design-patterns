package factory;

public class BwmFabrikasi extends ArabaFabrika {

	@Override
	public void createAuto() {
		getArabaListesi().add(new Z4(200));
	}

	@Override
	public void salesAuto() {
		for (Araba item : getArabaListesi()) {
			System.out.println("Sales  : " +  item.getMarka());
		}
	}

	
	
}
