package birdge;

public class UretimImplY implements Uretim {

	private FabrikaY fby = new FabrikaY();
	
	@Override
	public void productDefter() {
		fby.productCizgiliDefater();
	}

	@Override
	public void productKalem() {
		fby.productDolmaKalem();
	}


}
