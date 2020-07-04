package factory;

public class AudiFabrika extends ArabaFabrika {

	@Override
	public void createAuto() {
		getArabaListesi().add(new A5(140));
		getArabaListesi().add(new A5(123));
		getArabaListesi().add(new A5(120));
		
	}

	@Override
	public void salesAuto() {
		for (Araba item : getArabaListesi()) {
			System.out.println("Sales  : " +  item.getMarka());
		}
	}
	
}
