package command;

public class Kumanda {
	
	
	public Komut[] tus = new Komut[2];
	
	public Kumanda() {
		final Televizyon tv = new Televizyon();
		tus[0] = new TvAcKomutu(tv);
		tus[1] = new TvKapatKomutu(tv);
	}
	
	public void fncTus( final int i) {
		if ( i >= tus.length || i < 0 ) {
			throw new RuntimeException("Bu komut geçersiz");
		}
		if (tus[i] instanceof TvAcKomutu) {
			TvAcKomutu ta = (TvAcKomutu) tus[i];
			ta.tv.kanalDegistir();
		}
		tus[i].execute();
	}

}
