package memento;

import java.util.ArrayList;

public class Dokument {
	
	private ArrayList<String> satirlar = new ArrayList<>();
	
	public void addSatir( final int index, final String satir ) {
		getSatirlar().add(index, satir);
	}
	
	public void removeSatir ( final int index ) {
		getSatirlar().remove(index);
	}
	
	public Memento createMemento() {
		return new Memento(getSatirlar().toArray());
	}
	
	public void setMemento( final Memento memento ) {
		getSatirlar().clear();
		final Object[] temSatirlar = memento.getElements();
		for (int i = 0; i < temSatirlar.length; i++) {
			final String satir = (String) temSatirlar[i];
			getSatirlar().add(satir);
		}
	}
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		for (String item : getSatirlar()) {
			sb.append(item + System.lineSeparator());
		}
		return sb.toString();
	}

	public ArrayList<String> getSatirlar() {
		return satirlar;
	}

	public void setSatirlar(ArrayList<String> satirlar) {
		this.satirlar = satirlar;
	}
	
	

}
