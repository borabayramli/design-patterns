package command;

public class TvKapatKomutu implements Komut {
	
	private Televizyon tv;
	
	public TvKapatKomutu(Televizyon tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.kapat();
	}
	
}
