package birdge;

public abstract class Envanter {

	private Uretim uretim;
	
	public abstract void produce();
	
	public Envanter( final Uretim uretim ) {
		this.uretim = uretim;
	}

	public Uretim getUretim() {
		return uretim;
	}

	public void setUretim(final Uretim uretim) {
		this.uretim = uretim;
	}
	
	
	
	
}
