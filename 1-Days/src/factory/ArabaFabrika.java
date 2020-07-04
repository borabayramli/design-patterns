package factory;

import java.util.ArrayList;

public abstract class ArabaFabrika {
	
	public ArabaFabrika() {
		createAuto();
		salesAuto();
	}
	
	public abstract void createAuto();
	public abstract void salesAuto();
	
	
	private ArrayList<Araba> arabaListesi = new ArrayList<>();

	public ArrayList<Araba> getArabaListesi() {
		return arabaListesi;
	}

	public void setArabaListesi(ArrayList<Araba> arabaListesi) {
		this.arabaListesi = arabaListesi;
	}
	
	

}
