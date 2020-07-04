package factorymethod;

public class Test {

	public static void main(String[] args) {
		Document document = null;
		

		// pdf
		document = DocumentFactory.createDocument(DEnum.pdf);
		call(document);
		
		// word
		document = DocumentFactory.createDocument(DEnum.word);
		call(document);


	}
	
	public static void call( Document doc) {
		System.out.println(doc.getDocumentType());
		if ( doc instanceof Pdf ) {
			
		}
		
		if ( doc instanceof Word ) {
			
		}
	}

}
