package command;

public class TvAcKomutu implements Komut {
	
	public Televizyon tv = null;
	
	public TvAcKomutu( Televizyon tv ) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.ac();
	}

}
