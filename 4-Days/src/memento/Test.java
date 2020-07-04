package memento;

public class Test {

	public static void main(String[] args) {
		
		final Dokument doc = new Dokument();
		doc.addSatir(0, "Lorem Ipsum");
		doc.addSatir(1, "dizgi ve baskı");
		doc.addSatir(2, "kullanılan");
		doc.addSatir(3, "matbaacının");
		doc.addSatir(4, "standardı");
		doc.addSatir(5, "elektronik");
		
		final Memento memento = doc.createMemento();
		System.out.println("First Text");
		System.out.println(doc.toString());
		
		doc.removeSatir(3);
		doc.addSatir(3, "yayınlanması");
		System.out.println(doc.toString());
		
		
	}

}
