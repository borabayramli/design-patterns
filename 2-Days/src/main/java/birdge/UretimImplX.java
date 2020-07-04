package birdge;

public class UretimImplX implements Uretim {

	private FabrikaX fbx = new FabrikaX();
	
	@Override
	public void productDefter() {
		fbx.productKareliDefater();
	}

	@Override
	public void productKalem() {
		fbx.productTukenmezKalem();
	}
	
	

}
