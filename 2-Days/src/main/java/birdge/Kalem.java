package birdge;

public class Kalem extends Envanter {

	public Kalem(Uretim uretim) {
		super(uretim);
	}

	@Override
	public void produce() {
		produceKalem();
	}
	
	public void produceKalem() {
		getUretim().productKalem();
	}

}
